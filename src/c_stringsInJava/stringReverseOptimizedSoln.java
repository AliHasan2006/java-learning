package c_stringsInJava;

public class stringReverseOptimizedSoln {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("ABCDAFGHE JHK");
        System.out.println("Original String: "+str);
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            char frontChar = str.charAt(start);
            char backChar = str.charAt(end);

            str.setCharAt(start,backChar);
            str.setCharAt(end,frontChar);
             start ++;
             end --;
        }
        str.toString();
        System.out.println("Reversed String: "+str);
    }
}
