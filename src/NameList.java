/**
 * Created by rusk on 4/8/16.
 */
public class NameList {
    public static void main(String[] args) {
        try {
            List<String> names = new List<>(10);
            System.out.println(names.toString());
        }catch (ListEmptyException e){
            e.printStackTrace();
        }
    }
}
