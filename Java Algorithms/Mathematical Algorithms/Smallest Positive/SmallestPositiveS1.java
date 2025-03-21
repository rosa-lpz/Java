// Smalles Positive Number - Solution 1

import java.util.Arrays;

public class SmallestPositiveS1 {

    public static Integer smallestPositive(int[] inList) {
        // Sort the array in ascending order
        Arrays.sort(inList);

        // Iterate through the sorted array to find the first positive number
        for (int i : inList) {
            if (i > 0) {
                return i;  // Return the first positive number
            }
        }

        // If no positive numbers are found, return null
        return null;
    }

    public static void main(String[] args) {
        // Example Usage
        System.out.println(smallestPositive(new int[] {-5, -1, -10, 0}));  // Output: null
        System.out.println(smallestPositive(new int[] {-5, 3, 0, 1, 7}));  // Output: 1
        System.out.println(smallestPositive(new int[] {0, -2, -3, 2}));    // Output: 2
    }
}
