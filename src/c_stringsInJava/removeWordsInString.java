package c_stringsInJava;

public class removeWordsInString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("the pen");
        System.out.println("Orignal String: "+str);
        str.reverse(); // reverse entire string

        String ans = "";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            StringBuilder word = new StringBuilder("");

            while (i < n && str.charAt(i) != ' ') {
                word.append(str.charAt(i));
                i++;
            }

            if (word.length() != 0) {
                word.reverse();          // reverse each word
                ans += word + " ";       // append instead of overwrite
            }
        }

        System.out.println("Reversed Words String: "+ans.trim());
        System.out.println("Your string reversed successfully with: \nTime Complexity: O(n)\nSpace COmplexity: O(n)");

    }
}
