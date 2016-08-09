/**
 * Created by rusk on 7/8/16.
 */
public class StringB {
    public static void main(String[] args) {
        //StringBuilder sentence = new StringBuilder();
        StringBuilder sentence = new StringBuilder("Just Do It.");
        System.out.println(sentence.toString());
        sentence.insert(0, "Nike - ");
        System.out.println(sentence);
        System.out.println("Do is found at positon " + sentence.indexOf("Do"));
        sentence.delete(0, 6);
        System.out.println(sentence);
        sentence.deleteCharAt(0);
        System.out.println(sentence);
        System.out.println("Inverse " + sentence.reverse());
    }
}
