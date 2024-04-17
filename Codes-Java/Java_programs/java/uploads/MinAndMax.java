import java.util.*;

public class MinAndMax {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Elements :  ");
        n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter The Array Elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(array);

        System.out.println("Minimum Is : " + array[0]);
        System.out.println("Maximum Is : " + array[array.length - 1]);
    }
}