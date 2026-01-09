package c_stringsInJava;

public class reverseString {

    public static void main(String[] args) {
        String str = "Hello";
        for (int i = str.length() - 1; i>=0; i--) {
            System.out.print(str.charAt(i));
        }
    }

//    using inBuilt Function - Reverse Function
//public static void main(String[] args) {
//    String orignalStr = "the pen";
//    StringBuilder str = new StringBuilder(orignalStr);
//    str.reverse();
//    System.out.println("Original String: "+orignalStr);
//    System.out.println("Reversed String: "+str);
//}
}
