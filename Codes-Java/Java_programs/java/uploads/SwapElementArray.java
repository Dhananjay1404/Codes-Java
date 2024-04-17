import java.util.*;

class SwapElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp, i, n;

        // Array Elements Must Be in Even Quantity
        System.out.println("Enter Total Number Of Elements :- ");
        n = sc.nextInt();

        // Initializing an array
        int[] array = new int[n];

        // Reading Array Elements Fron User
        System.out.println("Enter Array Elements :- ");
        for (i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Swapping Elements
        for (i = 0; i < n; i += 2) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        System.out.println("Elements After Swapping Adjacent Elements :- ");

        for (i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        sc.close();
    }
}