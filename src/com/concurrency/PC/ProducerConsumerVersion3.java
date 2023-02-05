package src.com.concurrency.PC;

public class ProducerConsumerVersion3 {

    private int i = 0;

    final private Object LOCK = new Object();

    private volatile boolean isProduced = false;

    public void produced(){
        synchronized (LOCK){
            if (isProduced){
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                i++;
                System.out.println("P->"+i);
                LOCK.notify();
                isProduced = true;
            }
        }
    }
    public void consume(){
        synchronized (LOCK){
            while (!isProduced){
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (isProduced){
                System.out.println("C->"+i);
                LOCK.notify();
                isProduced = false;
            }else {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
