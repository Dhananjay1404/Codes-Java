import java.util.*;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, i, count, n;
        System.out.print("Enter The Number n");
        n = sc.nextInt();
        for (num = 1; num <= n; num++) {
            count = 0;
            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && num != 1)
                System.out.println(num);
        }
    }
}
