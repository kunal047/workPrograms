import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by rusk on 6/8/16.
 */
public class RunnableTThreads {

    public static void main(String[] args) throws InterruptedException{
        Thread firstThread = new Thread(new UserInteraction());
        firstThread.start();
        ComputeLog numProc = new ComputeLog();
        Thread secondThread = new Thread(numProc);
        secondThread.start();
        firstThread.join();
        numProc.end();
    }
}

class UserInteraction implements Runnable{
    @Override
    public void run() {
        try {
            BufferedReader userIn = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.print("Hello How are you ?");
            String in = userIn.readLine();
            System.out.println("What are you doing today ?");
            in = userIn.readLine();
            System.out.println(in + " sounds like fun.");
        }catch (IOException e){
            System.out.println("Caught I/O Exception.");
        }
    }
}

class ComputeLog implements Runnable{
    private static boolean stop = false;

    @Override
    public void run() {
        try {
            int i = 1;
            double d = 0;
            while (!stop){
                d = Math.log(i++);
                Thread.currentThread().sleep(1);
            }
            System.out.println("The log of " + i + " is " + d);
        }catch (InterruptedException ie){
            System.out.println("Thread execution was interrupted.");
        }
    }
    public void end(){
        stop = true;
    }
}
