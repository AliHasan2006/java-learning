package d_recursionInJava;
//print x^n where stack height = log n;
public class recursionProblem06 {
    public static int calcPower(int x,int n){
        if (n==0) return 1;  // base case 1
//        if (x==0) return 0; // base case 2
        if (n%2 == 0) {
            return (calcPower(x,n/2)*calcPower(x, n/2));
        }
        else {
            return calcPower(x,n/2)*calcPower(x, n/2)*x;
        }
    }
    public static void main(String[] args) {
        int x =2;
        int n =3;
        System.out.println("Result is : "+calcPower(x,n));
    }
}
