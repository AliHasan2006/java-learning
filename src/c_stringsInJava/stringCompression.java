package c_stringsInJava;

public class stringCompression {
    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','b','b','b','b','b','b','b','b','c','c','c'};
        int idx = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            char ch = arr[i];
            int count = 0;

            while (i < n && ch == arr[i]) {
                count++;
                i++;
            }

            arr[idx++] = ch;

            if (count > 1) {
                String str = Integer.toString(count);
                for (char dig : str.toCharArray()) {
                    arr[idx++] = dig;
                }
            }

            i--;
        }

        // Correct output
        System.out.println(new String(arr, 0, idx));
    }
}
