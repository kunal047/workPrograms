/**
 * Created by rusk on 7/8/16.
 */
import java.util.regex.*;

public class RegEx {

    public static void main(String[] args) {
        String words = "now is the time or now is not the time";
        String patt = "now";
        Pattern pattern = Pattern.compile(patt);
        Matcher matcher = pattern.matcher(words);
        System.out.println(words);
        while (matcher.find()){
            System.out.println("found " + patt + " at : " + matcher.start());
            System.out.println("Match : " + matcher.group());
        }
    }
}
