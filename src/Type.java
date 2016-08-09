/**
 * Created by rusk on 4/8/16.
 */

import java.io.*;
import java.util.*;
public class Type {
    public static void main(String[] args) {
        String file = "/home/rusk/javaProg/workPrograms/src/dance.txt";
        String line = "";
        BufferedReader inFile = null;
        try {
            inFile = new BufferedReader(new FileReader(file));
            System.out.println("Hooray ! It exists !!");
            while ((line = inFile.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found !");
        } catch (IOException e) {
            System.out.println("Problem Reading File");
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException e) {
                    System.out.println("Problem with file.");
                }
            }
            System.out.println("I am going to execute myself ! ");
        }
    }
}
