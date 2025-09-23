package f_twoPointersProblems;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 45, 62, 242, 444, 1000};
        int targetVal = 242;

        // Step 1: Sort array for binary search
        Arrays.sort(arr);  // arr becomes [2, 3, 4, 6, 45, 100]

        int first = 0;
        int last = arr.length - 1;
        boolean found = false;
        int mid;
        while (first <= last) {
            mid = first + (last - first) / 2;

            if (arr[mid] == targetVal) {
                System.out.println("Yes, value found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < targetVal) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
         }

        if (!found) {
            System.out.println("Value not found.");
        }
    }
}
