package b_arrayInJava;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        System.out.println(arr);
        int size = arr.length -1;
//        System.out.println(size);
        int[] newArr = new int[size];
        for (int i = size-1; i >=0; i--){
//            System.out.println(arr[i]);
            newArr[(size-1)-i]=arr[i];
        }
        System.out.println(Arrays.toString(newArr));
//        int i=4;
//        while (i>=0){
//            System.out.println(arr[i]);
//            i--;
//        }
    }
}
