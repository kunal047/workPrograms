/**
 * Created by rusk on 24/7/16.
 */
public class ArrayDisplay {

    static  <T> void Display(T[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "David";
        names[1] = "Dav";
        names[2] = "D";
        names[3] = "Britt";
        names[4] = "Diana";
        names[5] = "Dravid";
        names[6] = "Dennis";
        Display(names);
        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8};
        System.out.println();
        Display(numbers);
    }
}
