package f_twoPointersProblems;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {3,5,67,8,2,1};
        int size = arr.length-1;
        System.out.println(size);
        int startPointer = 0;
        int endPointer = size;
        while (startPointer < endPointer){
            int temp;
            temp = arr[startPointer];
            arr[startPointer] = arr[endPointer];
            arr[endPointer] = temp;
            startPointer++;
            endPointer--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
