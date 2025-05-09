package HASHMAPS;

// leetcode 3396
// https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/?envType=daily-question&envId=2025-04-08

public class MinimumNumberOfOperationsToMakeElementsInArrayDistinct {

    public static void main(String[] args) {

        MinimumNumberOfOperationsToMakeElementsInArrayDistinct answer = new MinimumNumberOfOperationsToMakeElementsInArrayDistinct();
        int[] nums = {1,2,3,4,2,3,3,5,7};

        System.out.println(answer.minimumOperations(nums));

    }


    public int minimumOperations(int[] nums) {

        int n = nums.length;
        // step 1 create the custom hash map size 101
        int[] hash = new int[101];
        for (int num : nums)
            hash[num]++;

        //step 2 do operations
        int answer = 0;
        int index = 0;
        while (!uniqueElement(hash)){
            int count = 3;  // remove three elements maximum

            while( index <= n && count-- > 0){
                hash[nums[index]]--;
                index++;
            }
            answer++;
        }

        return answer;
    }

    private boolean uniqueElement(int[] hash) {
        for (int i = 0; i < hash.length; i++)
            if (hash[i] > 1)
                return false;
        return true;
    }

}

/*
import java.util.*;

class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> seen = new HashSet<>();
        for (int i = n - 1; i >= 0; i--) {
            if (seen.contains(nums[i])) {
                return i / 3 + 1;
            }
            seen.add(nums[i]);
        }
        return 0;
    }
}
 */
