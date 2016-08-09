/**
 * Created by rusk on 4/8/16.
 */
public class bubbleSort {
    public static void main(String[] args) {
        int size = 10;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = (int)(Math.random() * 100);
        }
        System.out.println("Before Sorting");
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }

        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }


        System.out.println();
        System.out.println("After sorting " );
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }
}
