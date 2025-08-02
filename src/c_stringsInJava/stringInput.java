package c_stringsInJava;

import java.util.Scanner;

public class stringInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Enter a String: ");
        str = input.nextLine();
        System.out.println("The String is....\n"+str);
    }

}
