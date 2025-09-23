package f_twoPointersProblems.majorityElementProblem;

public class mooresVotingAlgo {
    // Moore's Voting Algorithm:
    // Idea: Majority element ki frequency hamesha n/2 se zyada hoti hai.
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 1, 3,1, 3, 3, 35, 3};
        int ans = 0;
        int freqCount = 0;
        int n = arr.length;

        // Phase 1: Candidate select karna
        for (int i = 0; i < n; i++) {
            if (freqCount == 0) {
                ans = arr[i];
//                freqCount = 1;
            } else if (arr[i] == ans) {
                freqCount++;
            } else {
                freqCount--;
            }
        }

        // Phase 2: Verify candidate (important step)
        int count = 0;
        for (int val : arr) {
            if (val == ans) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority Element = " + ans);
            System.out.println("Frequency = " + count);
        } else {
            System.out.println("No Majority Element found");
        }

        // ✅ Time Complexity: O(n)
        // ✅ Space Complexity: O(1)
    }
}
