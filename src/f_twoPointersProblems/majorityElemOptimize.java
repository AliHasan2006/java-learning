package f_twoPointersProblems;

import java.util.Arrays;

public class majorityElemOptimize {
    public static int findMajorityElem(int[] arr){
        Arrays.sort(arr);
        int ans= arr[0];
        int freqCount = 1;
        int n = arr.length;
        for (int i = 1; i < n; i++) {
             if (arr[i]==arr[i-1]){
                 freqCount++;
             }
             else {
                 freqCount=1;
                 ans=arr[i];
             }
             if (freqCount>n/2){
                 return ans;
             }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,1};
        System.out.println("Majority Element: "+findMajorityElem(arr));
    }
}
