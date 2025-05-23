package SORTING;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                // break if the value of j is greater than j - 1 then it is already sorted
                else
                    break;
            }
        }
    }
}