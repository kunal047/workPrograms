/**
 * Created by rusk on 7/8/16.
 */

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class StringConcat {
    public static void main(String[] args) {
        BufferedReader input;
        String word, words = null;
        String file = "/home/rusk/javaProg/workPrograms/src/dance.txt";
        long startTime, stopTime, duration;
        startTime = stopTime = duration =0;
        try {
            input = new BufferedReader(new FileReader(file));
            startTime = System.nanoTime();
            while ((word = input.readLine()) != null){
                words += word + ",";
            }
            stopTime = System.nanoTime();
            duration = stopTime - startTime;
        }catch (IOException e){
            System.out.println(e.toString());
        }
        System.out.println("Time to concatenate " + duration);

        // STRING BUILDER

        startTime = stopTime = duration = 0;
        StringBuilder sbWords = new StringBuilder();
        try {
            input = new BufferedReader(new FileReader(file));
            startTime = System.nanoTime();
            while ((word = input.readLine()) != null){
                sbWords.append(word + ", ");
            }
            stopTime = System.nanoTime();
            duration = stopTime - startTime;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Time to append by String Builder " + duration);
    }
}
