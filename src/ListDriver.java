/**
 * Created by rusk on 24/7/16.
 */
public class ListDriver {
    public static void main(String[] args) {
        List<String> gList = new List<String>(10);
        gList.add("milk");
        gList.add("eggs");
        System.out.println("Grocery list : " + gList.toString());

        List<Integer> numbers = new List<Integer>(5);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        System.out.println("Numbers :" + numbers.toString());
    }
}

