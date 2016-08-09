/**
 * Created by rusk on 4/8/16.
 */
public class quickSort {

    public static void qSort(int[] arr, int left, int right){
        int i = left;
        int j = right;
        int temp;
        int pivot = arr[(left + right)/2];
        while (i <= j) {

            while (arr[i] < pivot){
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j){
            qSort(arr, left, j);
        }
        if (i < right){
            qSort(arr, i, right);
        }
    }


    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 10, 2, 4, 7, 45, 14, 26, 9, 19};
        System.out.println("Unsorted array : ");
        display(data);
        System.out.println("Length of data " + data.length);
        qSort(data, 0, data.length-1);
        System.out.println("Sorted array ");
        display(data);
    }
}
