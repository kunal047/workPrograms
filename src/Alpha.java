import java.util.TreeSet;

/**
 * Created by rusk on 28/7/16
 */

// Keeps in sorted order

public class Alpha {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("David");
        names.add("Bryan");
        names.add("Lynda");
        System.out.println("Number of names " + names.size());
        for (String nameList:
             names) {
            System.out.println(nameList);
        }
        System.out.println("Name before Bryan " + names.lower("Bryan"));
        System.out.println("Name after Bryan " + names.higher("Bryan"));

        System.out.println("First element: " + names.first());
        System.out.println("Last element: " + names.last());
    }
}
