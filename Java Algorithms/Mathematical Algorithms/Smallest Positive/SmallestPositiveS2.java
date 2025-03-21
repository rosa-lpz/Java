// Smalles Positive Number - Solution 2

public class SmallestPositiveS2 {
    public static Integer smallestPositive(int[] arr) {
        Integer smallestPos = null;

        for (int num : arr) {
            if (num > 0) {
                if (smallestPos == null || num < smallestPos) {
                    smallestPos = num;
                }
            }
        }
        
        return smallestPos; // Returns the smallest positive number or null if none found
    }

    public static void main(String[] args) {
        int[] arr1 = {-5, -1, -10, 0};
        int[] arr2 = {3, -5, 0, 1, 7};
        int[] arr3 = {10, 2, 5, -3};
        int[] arr4 = {0, -2, -3, 4};

        System.out.println(smallestPositive(arr1)); // Output: null
        System.out.println(smallestPositive(arr2)); // Output: 1
        System.out.println(smallestPositive(arr3)); // Output: 2
        System.out.println(smallestPositive(arr4)); // Output: 4
    }
}
