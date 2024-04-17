// program to read one sequence from user ant find missing number from sequence
// of numbers

// This method uses the technique of the summation formula. 
// Approach: The length of the array is n-1. So the sum of all n elements, i.e sum of numbers from 1 to n can be calculated using the formula n*(n+1)/2. Now find the sum of all the elements in the array and subtract it from the sum of first n natural numbers, it will be the value of the missing element.
// Algorithm: 
// Calculate the sum of first n natural numbers as sumtotal= n*(n+1)/2
// Create a variable sum to store the sum of array elements.
// Traverse the array from start to end.
// Update the value of sum as sum = sum + array[i]
// Print the missing number as sumtotal – sum

// Java program to find missing Number

import java.util.*;

class FindingMissingNumber {
    public static int findMissingNumbers(int[] nums) {
        int n = nums.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }

    public static void main(String[] args) {
        // int a[] = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Enter 10 Array Elements :- ");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("The Missing Number is :- " + findMissingNumbers(array));

        sc.close();
    }
}
