package f_twoPointersProblems;

public class containerMostWater {
    public static void main(String[] args) {

        int[] arr ={1,8,6,2,5,4,8,3,7};
        int maxWater = 0;

        for(int i=0; i<arr.length; i++){
            for (int j = i+1; j < arr.length; j++) {
                int width = j-i;
                int height = Math.min(arr[i],arr[j]);
                int area = width*height;
                maxWater = Math.max(area,maxWater);
            }
        }
        System.out.println("Max Water: "+maxWater);
    }
}
