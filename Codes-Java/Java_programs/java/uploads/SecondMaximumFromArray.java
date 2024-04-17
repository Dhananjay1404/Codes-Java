// Java program to find second largest number

// To find the second largest element of the given array, first of all, sort the array.

// Sorting an array
// Compare the first two elements of the array
// If the first element is greater than the second swap them.
// Then, compare 2nd and 3rd elements if the second element is greater than the 3rd swap them.
// Repeat this till the end of the array.
// After sorting an array print the second element from the end of the array.

public class SecondMaximumFromArray {
    public static void main(String args[]) {
        int temp, size;
        int array[] = { 17, 11, 68, 15, 87, 57 };
        size = array.length;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Second largest number is :- " + array[size - 2]);
    }
}
