/**
 * Created by rusk on 3/8/16.
 */
import java.util.TreeMap;
public class Numbers {
    public static void main(String[] args) {
        TreeMap<String, String> numbers = new TreeMap<>();
        numbers.put("David", "243082");
        numbers.put("Dravid", "245782");
        numbers.put("Bryan", "245782");
        System.out.println("Dravid :" + numbers.get("Dravid"));
        numbers.put("Jennifer", "454565");
        System.out.println("Size of numbers " + numbers.size());
        numbers.remove("Bryan");
        System.out.println("Size of numbers " + numbers.size());
    }
}
