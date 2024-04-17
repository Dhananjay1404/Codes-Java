import java.util.*;

public class CountElementArray {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Element ");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter The Element Which Frequency To Check ");
        int chkno = sc.nextInt();
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == chkno) {
                count++;
            }
        }
        System.out.println("The Entered Element " + chkno + " Has Occured " + count + " Times");
    }
}
