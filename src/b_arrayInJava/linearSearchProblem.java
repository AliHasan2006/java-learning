package b_arrayInJava;

import java.util.Scanner;

public class linearSearchProblem {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        size = input.nextInt();
        int[] myNum = new int[size];
        System.out.println("Taking array values from user....");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value at index "+i+": ");
            myNum[i] = input.nextInt();
        }

        System.out.print("Enter the value that you want: ");
        int searchingVal = input.nextInt();
        for (int i = 0; i < size; i++) {
            if (myNum[i]==searchingVal){
                System.out.println("The value is found at position "+(1+i)+" and the index of value is "+i);
                break;
            }
            else {
                System.out.println("Error: please select a valid value");
                break;
            }
        }
    }
}
