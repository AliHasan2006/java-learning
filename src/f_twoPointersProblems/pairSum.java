package f_twoPointersProblems;

// Return a pair in sorted array with target sum

import java.util.ArrayList;

public class pairSum {
    public static void main(String[] args) {
        int[] arr = {1,2,10,12,11,6};
        int targetVal = 13;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == targetVal){
                    arrayList.add(i);
                    arrayList.add(j);
                }
            }
        }
//     int size = arrayList.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(arrayList.get(i));
//        }
        System.out.println(arrayList);
    }
}
