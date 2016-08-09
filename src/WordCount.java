/**
 * Created by rusk on 3/8/16.
 */

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String text;
        text = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank and of having nothing to do " +
                "once or twice she had peeped into the book her sister " +
                "was reading but it had no pictures or conversations in " +
                "it and what is the use of a book thought Alice " +
                "without pictures or conversation";
        String[] words = text.split(" ");
        Arrays.sort(words);
        int count = 0;
        for (String word :
                words) {
            System.out.println("Word : " + word);
        }
        TreeMap<String, Integer> wordList = new TreeMap<>();
        String thisWord = "";
        String nextWord;
        for (int i = 0; i < (words.length - 1); i++) {
            thisWord = words[i];
            count++;
            nextWord = words[i + 1];
            if (!thisWord.equals(nextWord)){
                wordList.put(thisWord, count);
                count = 0;
            }
        }
        // handling odd word list count
        nextWord =  words[words.length - 1 ];
        if ((thisWord.equals(nextWord))){
            count++;
        }
        else {
            count = 1;
        }
        if (words.length % 2 != 0 ){
            wordList.put(nextWord, count);
        }

        Set set = wordList.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()){
            Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
    }
}
