package c_stringsInJava;

public class stringPalindrome {

    public static boolean checkAlphaNumericVal(char c){
        if ()
    }
    public static void main(String[] args) {
        String str = "madam";

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
