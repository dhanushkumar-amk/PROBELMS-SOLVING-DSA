package PREFIXSUM;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
//        int[] answer = prefixSum(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < answer.length; i++) {
//            System.out.print( answer[i] + " ");
//        }

        prefix(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] prefixSum(int[] arr){

        // create the prefix sum array with same size as arr
        int[] prefixSumArray = new int[arr.length];

        // assign the first element as sam
        prefixSumArray[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefixSumArray[i] = prefixSumArray[i - 1] + arr[i];
        }

        return prefixSumArray;
    }

    // efficient way to create to optimize the space

    static void prefix(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1]  + arr[i];
        }
    }
}
