package d_recursionInJava;

import java.util.HashSet;

public class uniqueSubSequence {
    public static void subSequence(String str,int idx,String newStr, HashSet<String> set){
        if (idx==str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char currChar = str.charAt(idx);
//         to be
        subSequence(str,idx+1,newStr+currChar,set);
//      or  not to be
        subSequence(str,idx+1,newStr,set);
    }
    // Time Complexity O(2^n);
    public static void main(String[] args) {
        String str= "aaaaa";
        HashSet<String> set = new HashSet<>();
        subSequence(str,0,"",set);
    }
}
