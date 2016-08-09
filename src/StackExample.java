/**
 * Created by rusk on 3/8/16.
 */

import java.util.*;
public class StackExample {

    public static void main(String[] args) {
        Stack names = new Stack();
        names.push("Kunal");
        names.push("Harjeet");
        names.push("Manan");
        System.out.println("Top of the stack " + names.peek());
        names.pop();
        System.out.println("Top of the stack " + names.peek());
        names.push("Mrinal");
        System.out.println("Top of the stack " + names.peek());
        if (!names.empty()){
            names.pop();
        }
        System.out.println("Top of the stack " + names.peek());
    }
}
