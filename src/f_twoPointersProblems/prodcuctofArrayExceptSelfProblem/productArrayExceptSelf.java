package f_twoPointersProblems.prodcuctofArrayExceptSelfProblem;

import java.util.Arrays;

public class productArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int n = arr.length;
        int[] ans = new int[n];

        // For each element, multiply all except itself
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)  product *= arr[j];
            }
            ans[i] = product;
        }

        System.out.println("Input: " + Arrays.toString(arr));
        System.out.println("Output: " + Arrays.toString(ans));
        System.out.println("Time Complexity O(n)");
    }
}
