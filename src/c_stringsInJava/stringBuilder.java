package c_stringsInJava;

public class stringBuilder {
    //     Strings are immutable if we declare it in a memory we can not modify it
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

//         char at 0
        System.out.println(sb.charAt(0));
//        set char at index 0
        sb.setCharAt(0,'p');
        System.out.println(sb);
//       insert method
        sb.insert(0,'S');
        System.out.println(sb);
//        delete method
        sb.delete(0,1);
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
//        append method
        sb.delete(0,1);
        sb.insert(0,'T');
        sb.append('s');
        System.out.println(sb);
    }
}