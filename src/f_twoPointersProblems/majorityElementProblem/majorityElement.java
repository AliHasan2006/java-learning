package f_twoPointersProblems.majorityElementProblem;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 1};
        int majorityElem = -1;
        int n = arr.length;

        for (int val : arr) {
            int freq = 0;
            for (int elem : arr) {
                if (elem == val) {   // element match
                    freq++;
                }
            }
            if (freq > n / 2) {
                majorityElem = val;
                break;  // majority mil gaya to loop se bahar
            }
        }

        if (majorityElem != -1) {
            System.out.println("Majority Element is: " + majorityElem);
        } else {
            System.out.println("No Majority Element found");
        }
    }
}
