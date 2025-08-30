package d_recursionInJava;
// Remove duplicates in a string
/* if we perform 'c' - 'a' = 2;
     'a' -'a'=0;
     'b' - 'a' = 1;
 */
public class rmvDuplicates {
    public static boolean map[] = new boolean[26];
     public static void rmvDuplicates(String str, int idx, String newStr){
         if (idx==str.length()){
             System.out.println(newStr);
             return;
         }
         char currentChar = str.charAt(idx);
         if (map[currentChar - 'a']){
             rmvDuplicates(str,idx+1,newStr);
         }
         else {
             newStr += currentChar;
             map[currentChar - 'a'] = true;
             rmvDuplicates(str,idx+1,newStr);
         }
     }

    public static void main(String[] args) {
        String str = "abccddaadcaa";
        rmvDuplicates(str,0,"");
    }
}
