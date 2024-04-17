import java.util.*;

public class SearchItemArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, searchno, found = 0;
        System.out.println("Enter The No Of Element :");
        n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter The Array Elements");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter The Element For Searching");
        searchno = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (a[i] == searchno) {
                System.out.println("Element " + searchno + " Found At " + i + " Position");
                found = 1;
                break;
            }
        }
        if (found == 0) {
            System.out.println("Element " + searchno + " Not Found");
        }
    }
}
