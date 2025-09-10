package f_twoPointersProblems;

public class maximumSubArraySum {
    public static void main(String[] args) {
      int[] arr = {3,-4,5,4,-1,7,-8};
      int max=Integer.MIN_VALUE;
        for (int start = 0; start < arr.length; start++) {
                int curSum = 0;
            for (int end = start; end <arr.length; end++) {
                curSum+=arr[end];
                max = Math.max(curSum,max);
            }
        }
        System.out.println(max);
        System.out.println("Time Complexity of this code is O(n^2) ");
    }
}
