package c_stringsInJava;

import java.util.Scanner;

public class stringPalindrome {
    public static void main(String[] args) {

        String str;
        System.out.println("Enter any String");
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        str = str.toUpperCase();
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
