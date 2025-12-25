package h_binarySearchProblems;

public class bookAllocationProblem {
    public static boolean isValid(int[] arr,int maxAllowedPages,int m,int n){
//if any book is larger than maxAllowedPages, it's impossible.
        for (int x : arr) {
            if (x > maxAllowedPages) {
                return false;
            }
        }
        int student=1;
        int pages =0;
        for (int i = 0; i < arr.length; i++) {
            if (pages+arr[i]<=maxAllowedPages){
                pages+=arr[i];
            }
            else {
                student++;
                if (student > m) {
                    return false;
                }
                pages=arr[i];
            }
        }
        if (student <= m){ // Changed '==' to '<=' for correct binary search logic
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4};
        int n = 4;
        int m = 2; // numberOfStudents
        int sum = 0;
        int maxPages = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if (arr[i] > maxPages) {
                maxPages = arr[i];
            }
        }
        int start = maxPages;
        int end = sum;  // max number of books that have a student
        int ans=0;
        if (m > arr.length) {
            System.out.println("Error: More students than books. Allocation not meaningful.");
            return;
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if (isValid(arr,mid,m,n)){
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
                System.out.println("Answer not found yet");
            }
        }
        System.out.println("The minimum maximum pages a student must read is: " + ans);
    }
}