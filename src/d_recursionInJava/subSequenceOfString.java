package d_recursionInJava;

public class subSequenceOfString {
    public static void subSequence(String str,int idx,String newStr){
        if (idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
//         to be
        subSequence(str,idx+1,newStr+currChar);
//      or  not to be
        subSequence(str,idx+1,newStr);
    }
// Time Complexity O(2^n);
    public static void main(String[] args) {
        String str= "ab";
        subSequence(str,0,"");
    }
}
