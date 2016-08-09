/**
 * Created by rusk on 4/8/16.
 */
public class linearSearch {

    public static int min(int[] arr){
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args) {
        int[] data = {5, 10, 2, 4, 7, 45, 14, 26, 9, 19};
        int minimum = min(data);
        System.out.println("Minimum value is " + minimum);
    }
}
