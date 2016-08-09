/**
 * Created by rusk on 7/8/16.
 */

import java.util.regex.Pattern;

//metacharacters - \w \d \s
import java.util.regex.*;
public class RegEx1 {
    public static void main(String[] args) {
        String words = "90 percent effort 100 percent of the time";
        String patt = "\\s";
        //String patt = "\\w+";
        //String patt = "\\d+";
        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(words);
        System.out.println(words);
//        while (matcher.find()){
//            System.out.println("Found " + patt + " at : " + matcher.start());
//            System.out.println("Match " + matcher.group());
//        }
        int count = 0;
        while (matcher.find()){
            count++;
        }
        System.out.println("Spaces in our string " + count);
    }
}
