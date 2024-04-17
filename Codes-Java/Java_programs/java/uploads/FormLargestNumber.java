
// Java program to generate largest possible number with given digits
import java.util.*;

class FormLargestNumber {
    // Function to generate largest possible number with given digits
    static int findMaxNum(int arr[], int n) {
        // sort the given array in ascending order and then traverse into descending
        Arrays.sort(arr);
        int num = arr[0];
        // generate the number
        for (int i = n - 1; i >= 0; i--) {
            num = num * 10 + arr[i];
        }
        return num;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 0 };
        int n = arr.length;
        System.out.print("The Largest Number Formed By Given Numbers :- ");
        System.out.println(findMaxNum(arr, n));
    }
}
