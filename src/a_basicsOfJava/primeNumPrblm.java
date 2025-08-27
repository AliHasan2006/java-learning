package a_basicsOfJava;

import java.util.Scanner;

public class primeNumPrblm {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        n=input.nextInt();
        int count = 0;
        for (int i = 2; i <=n-1; i++) {
            if (n%i == 0){
                count ++;
            }
        }
        if (count == 0){
            System.out.println("The Number is Prime...");
        }
        else {
            System.out.println("The Number is not a Prime...");
        }
    }
}
