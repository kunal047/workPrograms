/**
 * Created by rusk on 3/8/16.
 */

import java.util.LinkedList;
public class NameQueue {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.addLast("Kunal");
        names.addLast("Manan");
        names.addLast("Mrinal");
        for (String name:
             names) {
            System.out.println(name);
        }
        names.removeFirst();
        System.out.println("New List ");
        for (String name:
                names) {
            System.out.println(name);
        }
        names.addLast("Harjeet");
        System.out.println("Again ");
        for (String name:
                names) {
            System.out.println(name);
        }
        System.out.println("Size of the queue " + names.size());
        System.out.println();
        names.remove(2);
        for (String name:
                names) {
            System.out.println(name);
        }
        if(! names.isEmpty()){
            System.out.println("Size "+ names.size());
        }
    }
}
