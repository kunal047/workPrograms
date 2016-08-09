/**
 * Created by rusk on 3/8/16.
 */

import java.util.PriorityQueue;
import java.io.*;

public class SquareDance {
    public static void main(String[] args) {
        PriorityQueue<String> men = new PriorityQueue<>();
        PriorityQueue<String> women = new PriorityQueue<>();
        String line = null;
        String file = "/home/rusk/javaProg/workPrograms/src/dance.txt";
        String sex = "";
        BufferedReader input = null;
        String curDir = System.getProperty("user.dir");
        System.out.println("Current working directory " + curDir);
        try{
            try {
                input = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while ((line = input.readLine())!= null){
                sex = line.substring(0, 1);
                if (sex.equals("M")){
                    men.add(line.substring(2));
                }
                else{
                    women.add(line.substring(2));
                }

            }
            input.close();
        }
        catch(IOException exception){
            System.out.println("Error opening file");
        }
        while (!men.isEmpty() && !women.isEmpty()){
            System.out.println("The dance partners will be ");
            System.out.println(men.poll() + " and " + women.poll());
        }
        if (women.peek() != null){
            System.out.println("There is/are " + women.size());
            System.out.print("women waiting to dance.");
            System.out.println(women.peek() + " is the next women dancer.");
        }
        if(men.peek() != null){
            System.out.println("There are " + men.size());
            System.out.println("men waiting to dance.");
            System.out.println(men.peek() + " is the next men dancer.");
        }
    }
}
