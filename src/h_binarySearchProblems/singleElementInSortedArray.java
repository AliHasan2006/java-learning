package h_binarySearchProblems;

public class singleElementInSortedArray {
    public static void main(String[] args) {
//        int[] arr = {1,1,2,3,3,4,4,8,8};
        int[] arr = {1,1,2,3,3,4,4};
        int start = 0;
        int n = arr.length;
        int end = n;
        if (n==0){
            System.out.println(arr[0] + "is a single Element");
        }
        while (start<=end){
            int mid = start + (end-start)/2;
            if ((arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1])) {
                System.out.println(arr[mid] +" is a single Element");
                return;
            }
            if (mid== 0 && arr[mid] != arr[mid+1]){
                System.out.println(arr[mid] +" is a single Element");
                return;
            }
            if(mid==n-1 && arr[mid] != arr[mid-2]){
                System.out.println(arr[mid] +" is a single Element");
                return;
            }
            if (mid%2==0){
               if (arr[mid] == arr[mid-1]){
                   end=mid-1;
               }
               else {
                   start=mid+1;
               }
            }
            else {
                if (arr[mid]==arr[mid-1]){
                    start=mid+1;
                }
                else {
                    end=mid-1;
                }
            }
        }
    }
}
