import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rusk on 4/8/16.
 */
public class binarySearch {

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i % 10 == 0){
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static int bSearch(int[] arr, int key){
        int first = 0;
        int last = arr.length - 1;
        while (first <= last){
            int mid = (first + last)/ 2;
            if (key > arr[mid]){
                first = mid + 1;
            }
            else if (key < arr[mid]){
                last = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final int size = 100;
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random()*100);
        }
        Arrays.sort(numbers);
        display(numbers);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to search for ");
        int num = input.nextInt();
        int indexFound = bSearch(numbers, num);
        if (indexFound >= 0){
            System.out.println("Found key at position " + indexFound);
        }else {
            System.out.println("Key not found !!");
        }
    }
}
