package c_stringsInJava;

public class removeAllOccurrencesOfASubStr {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("daabcbaabcbc");
        String substr = "abc";
        int partLength = substr.length();

        int index = str.toString().indexOf(substr);

        while (index != -1) {
            str.delete(index, index + partLength);
            index = str.toString().indexOf(substr);
        }

        System.out.println(str.toString());
    }
}
