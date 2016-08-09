/**
 * Created by rusk on 7/8/16.
 */

import java.util.regex.*;
public class RegEx2 {
    public static void main(String[] args) {
        String name = "Kunal Chauhen Sejal Chouhan Ramesh Chahan ";
        String patt = "Ch.*? ";
        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(name);
        System.out.println(name);
        while (matcher.find()){
            System.out.println("Match " + matcher.group());
        }
        name = matcher.replaceAll("Chauhan");
        System.out.println("Output " + name);
    }
}
