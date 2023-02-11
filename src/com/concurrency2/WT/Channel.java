package src.com.concurrency2.WT;

import src.com.concurrency2.guardsuspension.Request;

import java.util.Arrays;

public class Channel {

    private final static int MAX_REQUEST = 100;

    private final Request[] requestQueue;

    private int head;
    private int tail;
    private int count;
    private final WorkerThread[] workpool;

    public Channel(int workers){
        this.requestQueue =new Request[MAX_REQUEST];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
        this.workpool = new WorkerThread[workers];
        this.init();
    }

    private void init() {
        for (int i = 0; i<workpool.length;i++){
            workpool[i] = new WorkerThread("Worker-"+i,this);
        }
    }

    public void startWorker(){
        Arrays.asList(workpool).forEach(WorkerThread::start);
    }
    public synchronized void put(Request request){
        while (count> requestQueue.length){
            try {
                this.wait();
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.requestQueue[tail] = request;
        this.tail = (tail + 1)% requestQueue.length;
        this.count++;
        this.notifyAll();
    }
    public synchronized Request take(){
        while (count<=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        Request request = this.requestQueue[head];
        this.head = (this.head+1)%this.requestQueue.length;startWorker();
        this.count--;
        this.notifyAll();
        return  request;
    }
}
