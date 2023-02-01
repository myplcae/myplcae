package src.com.ThreadStudy;


//创建线程方式2，实现runnable接口重写run方法，执行线程需要丢入runnable接口实现类，调用start方法
public class TestThread3 implements Runnable{
    @Override
    public void run() {

            //run方法线程体
            for (int i =0; i <20; i++){
                System.out.println("看电视！！！！！！"+i);
            }
        }

        public static void main(String[] args) {
            //创建runnable接口的实现类对象
            TestThread3 testThread3 = new TestThread3();
            //创建一个线程对象,通过线程对象来开启我们的线程，代理
//            TestThread testThread = new TestThread(testThread3);
//            //调用start方法开启线程
//            testThread.start();

            new Thread(testThread3).start();

            for (int i = 0; i < 20; i++) {
                System.out.println("学习多线程~~~~~~~~~"+i);
            }
        }
}
