package d_recursionInJava;
// print the reverse of a string using recursion
public class recursionProblem07 {

  public static void revString(String str,int idx){
     if (idx==0){
         System.out.print(str.charAt(idx));
         return;
     }
      System.out.print(str.charAt(idx));
     revString(str,idx-1);
  }
//time complexity O(n) =
    public static void main(String[] args) {
        String str = "Ali Hasan";
        revString(str,str.length()-1);
    }
}
