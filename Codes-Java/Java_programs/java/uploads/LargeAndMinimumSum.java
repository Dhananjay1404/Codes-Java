// Implementation of the above approach

import java.util.*;

class LargeAndMinimumSum {

    static void minMax(int[] arr) {
        // Initialize the min_value and max_value to 0
        long min_value = 0;
        long max_value = 0;
        int n = arr.length;

        // Sort array before calculating min and max value
        Arrays.sort(arr);

        for (int i = 0, j = n - 1; i < n - 1; i++, j--) {
            // All elements except rightmost will be added
            min_value += arr[i];

            // All elements except leftmost will be added
            max_value += arr[j];
        }

        // Output: min_value and max_value
        System.out.println("Minimim Sum : " + min_value);
        System.out.println("Maximum Sum : " + max_value);
    }

    // Driver Code
    public static void main(String[] args) {
        // Initialize your array elements here
        int[] arr = { 10, 9, 8, 7, 6, 5 };
        minMax(arr);
    }
}
