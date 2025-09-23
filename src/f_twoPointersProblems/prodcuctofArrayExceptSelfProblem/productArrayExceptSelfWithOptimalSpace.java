package f_twoPointersProblems.prodcuctofArrayExceptSelfProblem;

import java.util.Arrays;

public class productArrayExceptSelfWithOptimalSpace {
    public static void main(String[] args) {
        int[] numsArray = {1, 2, 3, 4};
        int n = numsArray.length;
        int[] ansArr = new int[n];

        ansArr[0] = 1;

        // Prefix product
        for (int i = 1; i < n; i++) {
            ansArr[i] = ansArr[i - 1] * numsArray[i - 1];
        }

        // Suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ansArr[i] *= suffix;
            suffix *= numsArray[i];
        }

        System.out.println("Result: " + Arrays.toString(ansArr));
        System.out.println("Time Complexity: O(n)");
        System.out.println("Space Complexity: O(1) extra space (excluding output array)");
    }
}
