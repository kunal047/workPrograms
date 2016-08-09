import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rusk on 4/8/16.
 */



public class TimingSearch {

    public static int lSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                return 1;
            }
            else {
                return 0;
            }
        }
        return -1;
    }

    public static int bSearch(int[] arr, int key){
        int first = 0;
        int last = arr.length - 1;
        while (first <= last){
            int mid = (first + last)/2;
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
        final int size = 100000;
        final int maxNums = 10000000;
        int n;
        ArrayList nums = new ArrayList();
        for (int i = 0; i < size; i++) {
            n = (int)(Math.random() * maxNums);
            if (! nums.contains(n)){
                nums.add(n);
            }
        }
        for (Object aNum : nums) {
            System.out.print(aNum + " ");
        }
        System.out.println();
        int[] numbers = new int[size];
        for (int i = 0; i < nums.size(); i++) {
            numbers[i] = (Integer)nums.get(i);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to search for ");
        int num = input.nextInt();
        long startTime = System.nanoTime();
        int found = lSearch(numbers, num);
        long stopTime = System.nanoTime();
        long duration =  stopTime - startTime;
        System.out.println("Linear Search time " + duration);
        Arrays.sort(numbers);
        System.out.println("Enter a number to search for ");
        num = input.nextInt();
        startTime = System.nanoTime();
        found = bSearch(numbers, num);
        stopTime = System.nanoTime();
        duration = stopTime - startTime;
        System.out.println("Binary search time " + duration);
    }
}
