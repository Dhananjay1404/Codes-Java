
public class FindPairsArraySumEqual {

    public static void getPairsCount(int[] arr, int sum) {

        int count = 0; // Initialize result

        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;

        System.out.println("Count of pairs is " + count);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
        getPairsCount(arr, sum);
    }
}