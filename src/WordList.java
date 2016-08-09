import java.util.TreeSet;

/**
 * Created by rusk on 2/8/16.
 */
public class WordList {
    public static void main(String[] args) {
        String text;
        text = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister " +
                "was reading, but it had no pictures or conversations in " +
                "it, `and what is the use of a book,' thought Alice " +
                "`without pictures or conversation?'";
        String[] words = text.split(" ");
        for (String w :
                words) {
            System.out.println(w);
        }
        System.out.println("Total number of words : " + text.length());
        TreeSet<String> wordList = new TreeSet<>();
        for (String w :
                words) {
            wordList.add(w);
        }
        System.out.println("Total number of unique words : " + wordList.size());
        for (String w :
                wordList) {
            System.out.println(w);
        }
    }
}
