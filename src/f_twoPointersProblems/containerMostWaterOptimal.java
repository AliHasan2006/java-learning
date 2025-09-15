package f_twoPointersProblems;

public class containerMostWaterOptimal {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxWater=0;
        int leftPointer = 0;
        int rightPointer = height.length-1;
        while (leftPointer<rightPointer){
            int wt = rightPointer-leftPointer;
            int ht = Math.min(height[leftPointer],height[rightPointer]);
            int currWater = wt*ht;
            maxWater = Math.max(maxWater,currWater);
            if (leftPointer < rightPointer) leftPointer++;
            if (rightPointer<leftPointer) rightPointer++;
        }
        System.out.println(maxWater);
    }
}
