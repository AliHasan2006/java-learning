package b_arrayInJava;

public class firstLastOccrofanArray {
    public static void main(String[] args) {
        int[] arr = {2,1,2,32,3,4,2};
        int firstOccur =-1;
        int lastOccur=-1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2){
                count++;
                if(firstOccur == -1){
                    firstOccur = 0;
                }
                else{
                    lastOccur = i;
                }
            }
        }
        System.out.println("The total number of Occurance of 2 is: "+count);
        System.out.println("The first Occurance is: "+firstOccur);
        System.out.println("The last Occurance is: "+lastOccur);

    }
}
