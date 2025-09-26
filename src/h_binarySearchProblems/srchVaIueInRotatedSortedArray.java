package h_binarySearchProblems;

public class srchVaIueInRotatedSortedArray {
    public static void main(String[] args) {
        // Rotated sorted array (pehle sorted tha, phir rotate kar diya)
        int[] array = {4,5,6,7,0,1,2,3};
        int target = 2; // jise dhoondhna hai
        int start = 0;
        int end = array.length - 1;

        // Binary Search lagayenge, lekin rotation ke wajah se thoda logic extra lagega
        while (start <= end) {
            // ✅ Mid calculation (overflow safe)
            int mid = start + (end - start) / 2;

            // Agar mid hi target hai → mil gaya
            if (array[mid] == target) {
                System.out.println("Target found at index: " + mid);
                System.out.println(" ✅ Overall Time Complexity = O(log n)");
                return; // program yahin khatam
            }

            // 🔹 Check karna padega kaunsa half sorted hai
            // Left half sorted hai
            if (array[start] <= array[mid]) {
                // Agar target iss left sorted half ke andar hai
                if (array[start] <= target && target < array[mid]) {
                    end = mid - 1; // search left side me
                } else {
                    start = mid + 1; // warna right side me dhoondo
                }
            }
            // Right half sorted hai
            else {
                // Agar target iss right sorted half ke andar hai
                if (array[mid] < target && target <= array[end]) {
                    start = mid + 1; // search right side me
                } else {
                    end = mid - 1; // warna left side me dhoondo
                }
            }
        }

        // Agar loop se bahar aa gaye → target nahi mila
        System.out.println("Target not found!");
    }
}
