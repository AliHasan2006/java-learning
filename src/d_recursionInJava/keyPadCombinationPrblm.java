package d_recursionInJava;

public class keyPadCombinationPrblm {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str, int idx, String combination) {
        // Base case
        if (idx == str.length()) {
//            System.out.println("Time complexity");
            System.out.println(combination);
            return;
        }

        // Current char
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        // Loop over possible mappings
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx + 1, combination + mapping.charAt(i));
        }
    }
// Time Complexity = O{4^n);
    public static void main(String[] args) {
        String str = "23";
        printCombination(str, 0, "");
    }
}
