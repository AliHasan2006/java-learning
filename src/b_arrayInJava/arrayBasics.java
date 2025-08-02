package b_arrayInJava;

public class arrayBasics {
    public static void main(String[] args) {
//        String[] subjects = {"C Programming","DSA","Oops in C"};
        String subjects[] = {"C Programming","DSA","Oops in C"};
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Subject"+(i+1)+" "+subjects[1]);
        }
    }
}
