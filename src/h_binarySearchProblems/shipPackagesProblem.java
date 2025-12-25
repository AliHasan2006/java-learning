package h_binarySearchProblems;

public class shipPackagesProblem {

    public static boolean isPossible(int[] arr, int maxWeightCapacity, int days, int n) {
        int d = 1;
        int totalWeight = 0;

        for (int weight : arr) {
            if (totalWeight + weight <= maxWeightCapacity) {
                totalWeight += weight;
            } else {
                d++;
                totalWeight = weight;
            }
        }

        return d <= days;
    }

    public static void main(String[] args) {
        int[] weight = {3, 2, 2, 4, 1, 4};
        int days = 3;
        int n = weight.length;

        int start = 0;
        int end = 0;

        for (int w : weight) {
            start = Math.max(start, w);
            end += w;
        }

        int minPossibleWeight = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(weight, mid, days, n)) {
                minPossibleWeight = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("The least weight capacity is: " + minPossibleWeight);
    }
}