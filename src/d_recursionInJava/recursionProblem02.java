// print sum 0f 1 to n numbers by using recursion
package d_recursionInJava;

public class recursionProblem02 {
    public static void printSum(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
    }

    public static void main(String[] args) {
        printSum(1,3,0);
    }
}
