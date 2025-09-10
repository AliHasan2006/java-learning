package b_arrayInJava;

public class smallestLargest {
    public static void main(String[] args) {
        int[] arr = {200, 58, 90, 430, 56, 80};
        int smallest = Integer.MAX_VALUE;
        int smallestIdx = 0;
        int largestIdx = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIdx = i;
            }
            if (arr[i] > largest) {
                largest = arr[i];
                largestIdx = i;
            }
        }

        System.out.println("Smallest Element: " + smallest);
        System.out.println("Smallest Index "+ smallestIdx);
        System.out.println("Largest Element: " + largest);
        System.out.println("Largest Element: "+largestIdx);
    }
}
