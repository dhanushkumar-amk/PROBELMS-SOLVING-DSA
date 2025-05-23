package OOPS.COMPARINGOBJECTS;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            arr.add(i);
        }

        // lambda expression example
        arr.forEach((item)  -> System.out.println(item + 2));

        // the above function is equal to
        System.out.println("------- normal for loop implementations -----------");
        for (int i = 0; i < arr.size() ; i++) {
            System.out.println(arr.get(i) + 2);
        }

        System.out.println("--- consumer type implementations---");
        Consumer<Integer> fun = (item) -> System.out.println(item + 2);
        arr.forEach(fun);

        Sum sum = (a, b) -> Integer.sum(a, b);

    }

    int sum(int a, int b){
        return a + b;
    }
}


interface Sum {
    int sum(int a, int b);
}