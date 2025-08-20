package d_recursionInJava;
// print x^n where stack height = n;
public class recursionProblem05 {
    public static int calcPower(int x,int n){
        if (n==0) return 1;
        if (x==0) return 0;
        int xPowNum1 = calcPower(x,n-1);
         int xPow = x*xPowNum1;
         return xPow;
//         this method is also working
//       return (x * calcPower(x, n-1));
    }
    public static void main(String[] args) {
        int x =10;
        int n =3;
//        int res=1;
//        int i =1;
        System.out.println("Result is : "+calcPower(x,n));
    }
}
