package b_arrayInJava;

public class peakIndexInArray {
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,7,5,4};
        for (int i = 1; i<7; i++) {
            if (arr[i]> arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
}
