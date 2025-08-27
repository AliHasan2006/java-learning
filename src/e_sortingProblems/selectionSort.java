package e_sortingProblems;

public class selectionSort {
    public static void printArray(int[] arr){
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        System.out.println("Sorting an array using Selection sort");
        int[] arr ={7,8,3,2,1};
        System.out.println("Print unsorted array...");
        printArray(arr);
        int length;
        length = arr.length-1;
        int smallestElement = arr[0];
//        System.out.println(length);
        for (int i = 0; i < length; i++) {
            int smallest = i;
            for (int j = i+1; j < length+1; j++){
                if (arr[smallest] > arr[j]){
                    smallest=j;
                }
                int temp = arr[smallest];
                arr [smallest] =arr[i];
                arr[i]=temp;
            }
        }

        System.out.println();
        System.out.println("Print sorted array...");
        printArray(arr);
    }
// time complexity O(n^2)
}


