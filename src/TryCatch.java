/**
 * Created by rusk on 4/8/16.
 */


public class TryCatch {
    public static void main(String[] args) {
        int n = 2;
        int d = 0;
        try {
            System.out.println(n/d);
        }catch (ArithmeticException e){
            System.out.println("Caught " + e);
            d = 1;
            System.out.println(n/d);
        }
    }
}
