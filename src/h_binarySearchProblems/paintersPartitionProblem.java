package h_binarySearchProblems;

public class paintersPartitionProblem {

    // Helper function to check if it's possible to paint all boards with given mid time
    public static boolean isPossible(int[] arr, int mid, int k, int n) {
        int painters = 1; // start with 1 painter
        int totalTime = 0;

        for (int i = 0; i < n; i++) {
            // if a single board is greater than mid, not possible
            if (arr[i] > mid) return false;

            // assign boards to current painter if total time ≤ mid
            if (totalTime + arr[i] <= mid) {
                totalTime += arr[i];
            }
            else {
                // assign new painter
                painters++;
                totalTime = arr[i];

                // if painters exceed available painters, not possible
                if (painters > k) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] boards = {40, 10, 20, 30};
        int painters = 2;
        int n = boards.length;

        // Calculate the minimum and maximum possible times
        int maxTime = 0;
        int minTime = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            minTime = Math.max(minTime, boards[i]);
            maxTime += boards[i];
        }

        int start = minTime;
        int end = maxTime;
        int ans = 0;

        // Binary search for the minimum possible maximum time
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(boards, mid, painters, n)) {
                ans = mid;
                end = mid - 1; // try to minimize
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Minimum time required to paint all boards = " + ans);
    }
}
