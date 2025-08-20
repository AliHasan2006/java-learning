package c_stringsInJava;

public class firstlastOccuranceInString {
    public static void main(String[] args) {
        String str = "aabbdaasxaa";
        int length = str.length() -1;
        int firstOccurance =-1;
        int lastOccurance =-1;
        for (int i = 0; i <=length; i++) {
            if (str.charAt(i)=='b'){
                if (firstOccurance ==-1){
                    firstOccurance = i;
                }
                else {
                    lastOccurance =i;
                }
            }
        }
        System.out.println(firstOccurance);
        System.out.println(lastOccurance);
    }
}
