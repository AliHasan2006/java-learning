package b_arrayInJava;

public class smallestElement {
    public static void main(String[] args) {
        int[] arr = {3,5,6,10,9};
        int smallest = arr[0];
        for (int i = 0; i < arr.length -1; i++) {
            int temp;
            if (arr[i]<smallest){
                temp = smallest;
                smallest=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("Smallest Element: "+smallest);
    }
}
