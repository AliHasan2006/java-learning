package a_basicsOfJava;

public class SquarePowerProblem {
    public static void main(String[] args) {
        int x = 4;
        int powerOfX = 3;
        int result = 1;
        for (int i = 1; i <=powerOfX ; i++) {
            result = result*x;
        }
        System.out.println(result);
    }
}
