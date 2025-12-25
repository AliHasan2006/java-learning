package f_twoPointersProblems.maxSubArraySum;
//Max subArray Sum problem using Kadane's Algorithm

public class kadanesAlgo {
    public static void main(String[] args) {
        int[] arr = {3,-4,5,4,-1,7,-8};
        int curSum = 0;
        int max=Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
            curSum +=arr[start];
            max=Math.max(curSum,max);
            if (curSum<0) curSum=0;
        }
        System.out.println(max);
        System.out.println("Time Complexity of this code is O(n) and and this is a Linear program\nThis is a optimal approach to print subarray sum");
    }
}

// Kadane's Alog logic -> Agar running sum negative ho jaaye to discard kardo, warna continue karke max update karte raho.