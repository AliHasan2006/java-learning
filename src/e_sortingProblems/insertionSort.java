package e_sortingProblems;

public class insertionSort {
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        System.out.println("Sorting an array using Selection sort");
        int[] arr = {7, 8, 3, 2, 1};
        System.out.println("Print unsorted array...");
        printArray(arr);
        int length;
        length = arr.length - 1;
        int smallestElement = arr[0];
//        System.out.println(length);
        for (int i = 1; i <=length; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            while (j>=0 && currentElement < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
//            placement
           arr[j+1]=currentElement;
        }
        System.out.println();
        System.out.println("Print sorted array...");
        printArray(arr);
    }
// time complexity O(n^2)
}

