package b_arrayInJava;

public class smallestElement {
    public static void main(String[] args) {
        int[] arr = {3,5,3,10,9};
        int smallest = arr[0];
        for (int i = 0; i < arr.length -1; i++) {
            int temp;
            if (arr[i]<smallest){
//            smallest = arr[i];
            smallest = Math.min(smallest,arr[i]);
            }
        }
        System.out.println("Smallest Element: "+smallest);
    }
}

//for swapping

//        int a =6;
//        int b =5;
//         a = a+b;
//         b = a-b;
//         a = a-b;
//        System.out.println(a + " " +b);

//                using third variable
//                temp = smallest;
//                smallest=arr[i];
//                arr[i]=temp;
//                wihtout using third variable