package d_recursionInJava;

public class firstLastOccurInString {
    public static int first =-1;
    public static int last =-1;

    public static void findOccur(String str,char element,int idx){
        if (idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        if (str.charAt(idx) == element){
            if (first==-1){
                first=idx;
            }
            else {
                last=idx;
            }
        }
        findOccur(str,element,idx+1);
    }
    public static void main(String[] args) {
        String str="babbcfaadcaa";
        findOccur(str,'a',0);
    }
}
