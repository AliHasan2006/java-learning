package f_twoPointersProblems;

import java.util.Arrays;

public class productArrayExceptSelfOptimal {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        int n= array.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int[] ans=new int[n];

        prefix[0] = 1;
        suffix[n-1] =1;

//        Prefix
        for (int i = 1; i < n; i++) {
            prefix[i]=prefix[i-1]*array[i-1];
        }
//        Suffix
        for (int i = n-2; i >= 0; i--) {
            suffix[i]=suffix[i+1]*array[i+1];
        }
        
        for (int i = 0; i < n; i++) {
            ans[i]=prefix[i]*suffix[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(ans));
    }
}
