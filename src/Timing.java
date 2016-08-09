/**
 * Created by rusk on 4/8/16.
 */


public class Timing {

    public static void bubbleSort(int[] arr){
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // For Quick Sort
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
            if (i % 10 == 0){
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int size = 10000;
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = (int)(Math.random() * 100);
        }
//        System.out.println("Unsorted array : ");
//        display(data);


//        System.out.println("\nSorted array by quicksort ");
//        display(data);
//        System.out.println();
//        bubbleSort(data);
//        System.out.println("\nSorted array by bubblesort ");
//        display(data);

        long startTime = System.nanoTime();
        qSort(data, 0, data.length-1);
        long stopTime = System.nanoTime();
        long duration = stopTime - startTime;
        System.out.println("QuickSort took " + duration + " nanoseconds");

        startTime = System.nanoTime();
        bubbleSort(data);
        stopTime = System.nanoTime();
        duration = stopTime - startTime;
        System.out.println("BubbleSort took " + duration + " nanoseconds");

    }
}
