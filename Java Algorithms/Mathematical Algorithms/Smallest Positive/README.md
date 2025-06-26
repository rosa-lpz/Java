# Smallest Positive

The method smallestPositive takes an array of integers and returns the smallest number greater than 0, or null if there are no positive numbers.

## Version 1
```java
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
```


## Version 1
```java
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
```
