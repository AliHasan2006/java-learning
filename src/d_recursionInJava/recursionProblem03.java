package d_recursionInJava;
// print factorial of n
public class recursionProblem03 {
    public static int factorialOfN(int n){
        if (n==0 || n==1) {
            return 1;
        }
        return (n*factorialOfN(n-1));
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The Factorial of n is: "+factorialOfN(n));
    }
}
