package e_sortingProblems;

public class bubbleSort {
    public static void printArray(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        System.out.println("Sorting an array using Bubble sort");
        int[] arr ={7,8,3,2,1};
        System.out.println("Print unsorted array...");
        printArray(arr);
        int length;
        length = arr.length-1;
//        System.out.println(length);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-i; j++) {
                int temp;
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("Print sorted array...");
        printArray(arr);
    }
// time complexity O(n^2)
}
