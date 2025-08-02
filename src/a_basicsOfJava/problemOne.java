package a_basicsOfJava;
import java.util.Scanner;
public class problemOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a Number: ");
            num =input.nextInt();
            System.out.println(num);
        }while(num >=0);
        System.out.println("Your tried to enter a negative value\nThe End...");
    }
}
