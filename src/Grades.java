/**
 * Created by rusk on 3/8/16.
 */

import java.util.HashMap;

public class Grades {
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("Kunal", 85);
        grades.put("Setu", 90);
        grades.put("Nausin", 88);
        System.out.println("Kunal's grade " + grades.get("Kunal"));
        System.out.println("Size of grades " + grades.size());
        if (grades.containsKey("Setu")){
            grades.remove("Setu");
            System.out.println("Record sucessfully removed.");
        }
        if (grades.containsValue(100)){
            System.out.println("Got someone genius here !!");
        }
        System.out.println("Size of grades " + grades.size());
    }
}
