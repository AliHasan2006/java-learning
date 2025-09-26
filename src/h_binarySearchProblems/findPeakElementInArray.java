package h_binarySearchProblems;

public class findPeakElementInArray {
//    A peak element is an element in an array where the numbers to its left are in increasing order and the numbers to its right are in decreasing order.}
// peak element will never be a starting value or ending value that will be already given in qns.
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 9, 15, 2};
        int start = 1;
        int end = arr.length - 2;
        while (start <=end){
            int mid = start + (end-start)/2;
            if (arr[mid-1] < arr[mid] && arr[mid]>arr[mid+1]){
                System.out.println(arr[mid]);
            }
            if (arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
    }
}