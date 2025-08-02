package b_arrayInJava;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        size = input.nextInt();
        int myNum[] = new int[size];
        System.out.println("Taking array values from user....");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value at index "+i+": ");
            myNum[i] = input.nextInt();
        }
        System.out.println("Printing array values....");
        for (int i = 0; i < size; i++) {
            System.out.println("The value at index "+i+": "+myNum[i]);
        }
    }
}
