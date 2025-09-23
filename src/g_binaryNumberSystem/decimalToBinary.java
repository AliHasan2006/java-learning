package g_binaryNumberSystem;

public class decimalToBinary {
    public static void main(String[] args) {
        int decimalNum = 2;
        int rem;
        int ans = 0;
        int power = 1;

//        while (decimalNum > 0) {
//            rem = decimalNum % 2;      // get remainder (0 or 1)
//            ans += (rem * power);      // add remainder * positional power
//            power *= 10;               // move to next binary digit place
//            decimalNum /= 2;           // reduce the number
//        }
        System.out.println(Integer.toBinaryString(decimalNum));
        System.out.println(ans);
    }
}
