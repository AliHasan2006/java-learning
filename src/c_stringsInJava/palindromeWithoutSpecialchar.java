package c_stringsInJava;

public class palindromeWithoutSpecialchar {
    public static boolean isAlphanumeric(char ch){
        if ( (ch >= '0' && ch <='9') || (ch >= 'a' && ch<='z')){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Ac3?e3c&a";
        int start = 0;
        int end = str.length()-1;
        boolean isPalindrome = true;
        str = str.toLowerCase();
        while (start < end){

            if(!isAlphanumeric(str.charAt(start))){
                start ++;
                continue;
            }
            if(!isAlphanumeric(str.charAt(end))){
                end --;
                continue;
            }
        if (str.charAt(start) != str.charAt(end)) {
            isPalindrome = false;
            break;
        }

        start++;
        end--;
    }

        if (isPalindrome) {
        System.out.println("Palindrome");
    } else {
        System.out.println("Not Palindrome");
    }
}
}
