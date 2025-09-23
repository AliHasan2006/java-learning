package f_twoPointersProblems.pairSumProblem;

import java.util.ArrayList;
import java.util.List;

public class pairSumOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 8};
        List<List<Integer>> pairs = new ArrayList<>();
        int targetVal = 9;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int currSum = arr[i] + arr[j];

            if (currSum < targetVal) {
                i++;  // move left pointer forward
            } else if (currSum > targetVal) {
                j--;  // move right pointer backward
            } else {
                // Pair found
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[j]);
                pairs.add(pair);

                // move both pointers
                i++;
                j--;
            }
        }

        System.out.println("Pairs with sum " + targetVal + " are: " + pairs);
    }
}
