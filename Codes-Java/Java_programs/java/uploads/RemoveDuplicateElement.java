import java.util.*;

class RemoveDuplicateElement {
    public static void main(String[] args) {
        int count = 0, i, j;
        // Creating Array
        int[] arr = new int[5];
        int[] temp = new int[5];

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Array Length :- ");
        // n = sc.nextInt();

        // Taking Input Array Element
        System.out.print("Enter 5 Array Elements :- ");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        // Printing Array Before Removing Duplicates Elements
        System.out.println("Array Elements Before Removing Dupliccates");
        for (i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        // Removing Duplicate Elements
        for (i = 0; i < 5; i++) {
            for (j = 0; j < count; j++) {
                if (arr[i] == temp[j])
                    break;
            }
            if (j == count) {
                temp[count] = arr[i];
                count++;
            }
        }
        // Printing Array After Removing Duplicates
        System.out.println("Array Elements AFTER Removing Dupliccates ");
        for (i = 0; i < count; i++) {
            System.out.println(temp[i]);
        }
        sc.close();
    }
}