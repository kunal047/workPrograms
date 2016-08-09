///**
// * Created by rusk on 6/8/16.
// */
//
//import java.io.*;
//public class TwoThreads {
//
//    public static void main(String[] args) throws InterruptedException{
//         Thread firstThread = new UserInteraction();
//        firstThread.start();
//        Thread secondThread = new ComputeLog();
//        firstThread.join();
//        ((ComputeLog) secondThread).end();
//    }
//}
//
//class UserInteraction extends Thread {
//    @Override
//    public void run() {
//        try {
//            BufferedReader userIn = new BufferedReader(
//                    new InputStreamReader(System.in));
//            System.out.print("Hello How are you ?");
//            String in = userIn.readLine();
//            System.out.println("What are you doing today ?");
//            in = userIn.readLine();
//            System.out.println(in + " sounds like fun.");
//        }catch (IOException e){
//            System.out.println("Caught I/O Exception.");
//        }
//    }
//}
//
//class ComputeLog extends Thread{
//    private static boolean stop = false;
//
//    @Override
//    public void run() {
//        try {
//            int i = 1;
//            double d = 0;
//            while (!stop){
//                d = Math.log(i++);
//                sleep(1);
//            }
//            System.out.println("The log of " + i + " is ");
//        }catch (InterruptedException ie){
//            System.out.println("Thread execution was interrupted.");
//        }
//    }
//    public void end(){
//        stop = true;
//    }
//}