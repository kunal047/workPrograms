/**
 * Created by rusk on 28/7/16.
 */

import java.util.HashSet;
public class Names {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("David");
        names.add("Bryan");
        names.add("Lynda");
        System.out.println("The number of names is " + names.size());
        for (String nameList : names) {
            System.out.println(nameList);
        }
        names.remove("David");
        names.add("Ray");
        String name = "David";
        if (names.contains(name)){
            System.out.println(name + " is in the collection.");
        }
        else{
            System.out.println(name + " is not in the collection.");
        }
        for (String nameList : names) {
            System.out.println(nameList);
        }
        names.clear();
        System.out.println("The size of name: " + names.size());

    }
}
