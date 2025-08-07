package a_basicsOfJava;
// print fibonacci sequence till nth number using for loop
public class fibonacciProblem {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c;
        int nthTerm = 7;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < nthTerm-2; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
