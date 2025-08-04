package d_recursionInJava;

/* print 5 to 1 numbers by using recursion
recursion is basically used to avoid ittirations. it is used in advanced data structure like tree and graph
*/
public class recursionProblem01 {
        public static void printNum(int n){
            if (n==0) return;
            System.out.println(n);
            printNum(n-1);
        }

        public static void main(String[] args) {
            int n = 10;
            printNum(n);
        }
    }

