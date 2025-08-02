package c_stringsInJava;
// Strings are is type of object and it is a non primptive datatype like aray
public class stringOne {
    public static void main(String[] args) {
//        String Declaration
        String str1 = "Hello...";
        String str2 = "Ali Hasan";
        String str3 = new String("Welcome in Java World!");
//        String Concatenation
//        System.out.println(str1+"\n"+str2+"\n"+str3);
        String str4 = str1+" "+str2+" "+str3;
        System.out.println(str4);
//        String Functions
        System.out.println(str4.length());
//        System.out.println(str1.length());
        System.out.println(str1.charAt(1));

/*
        Compare Method of String
         str1 > str2 return +ve;
         str1 == str2 return 0;
         str1 < str2 return -ve;
 */
        if (str1.compareTo(str2) == 0){
            System.out.println("Strings are equal");
        }
        else System.out.println("Strings are not equal");
//    Sub String Method
    String str5 = "This is Sentence";
    String subString = str5.substring(0,4);
        System.out.println(subString);
}
}