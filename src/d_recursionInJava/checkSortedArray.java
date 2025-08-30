package d_recursionInJava;

public class checkSortedArray {
    public static boolean isSorted(int arr[], int idx){
        if (arr[idx] == arr.length) return true;
        if (arr[idx] <arr[idx +1]) {
//            Sorted
            return isSorted(arr,idx+1);
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
          int arr[] = {1,2,5,7,9};
        System.out.println(isSorted(arr,0));
    }
}
