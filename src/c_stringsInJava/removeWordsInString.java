package c_stringsInJava;

public class removeWordsInString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("kon ho tum");
        System.out.println("Orignal String: "+str);
        str.reverse(); // reverse entire string

        StringBuilder ansString = new StringBuilder();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            StringBuilder word = new StringBuilder();

            while (i < n && str.charAt(i) != ' ') {
                word.append(str.charAt(i));
                i++;
            }

            if (!word.isEmpty()) {
                word.reverse();          // reverse each word
                ansString.append(word).append(' ');   // append instead of overwrite
            }
        }

        ansString.toString();
        System.out.println("Reversed Words String: "+ansString);
        System.out.println(str.length());
        System.out.println(ansString.length());
        System.out.println("Your string reversed successfully with: \nTime Complexity: O(n)\nSpace COmplexity: O(n)");
    }
}
