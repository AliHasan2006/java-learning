package d_recursionInJava;
// remove all x to the end of string;
public class recursionProblem08 {

    public static int count;

    public static void moveAllX(String str,String newStr,int idx,char x) {
        if (idx==str.length()){
            System.out.println(count);
            for (int i = 0; i < count; i++) {
                newStr+='x';
            }
            System.out.println(newStr);
            return;
        }
        if(str.charAt(idx)==x){
            count++;
            moveAllX(str,newStr,idx+1,x);
        }
        else {
        newStr+=str.charAt(idx);
        moveAllX(str,newStr,idx+1,x);
        }
    }

    public static void main(String[] args) {
        String str = "adxxcxxdxdx";
        String newStr ="";
        moveAllX(str,newStr,0,'x');
    }
}

// time complexity O(n);
