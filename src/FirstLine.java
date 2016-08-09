import java.util.PriorityQueue;

/**
 * Created by rusk on 28/7/16.
 */
public class FirstLine  {
    public static void main(String[] args) {
        PriorityQueue<String> line = new PriorityQueue<>();
        line.add("David");
        line.add("Raymond");
        line.add("Tia");
        line.add("Cynthia");
        line.forEach(System.out::println);
        line.poll(); // removes first element of queue
        System.out.println("\nUsing poll : ");
        line.forEach(System.out::println);
        line.remove("Tia"); // removes specific element

        System.out.println("\nUsing remove : ");
        line.forEach(System.out::println);

        System.out.println("\nThe head "+ line.peek()); // get the head of priority queue
    }
}
