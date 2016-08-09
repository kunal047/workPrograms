/**
 * Created by rusk on 6/8/16.
 */

class Market{
    int n;
    boolean valSet = false;
    synchronized int getN(){
        if (!valSet){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
        System.out.println("Got " + n);
        valSet = false;
        notify();
        return n;
    }
    synchronized void putN(int n){
        if (valSet){
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted.");
            }
        }
        this.n = n;
        valSet = true;
        System.out.println("Put " + n);
        notify();
    }
}

class Producer implements Runnable{
    Market m;
    public Producer(Market m){
        this.m = m;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            m.putN(i++);
        }
    }
}

class Consumer implements Runnable{
    Market m;
    public Consumer(Market m){
        this.m = m;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true ){
            m.getN();
        }
    }
}
public class PandC {
    public static void main(String[] args) {
        Market m = new Market();
        new Producer(m);
        new Consumer(m);
        System.out.println("Stop by pressing Ctrl-C");
    }
}
