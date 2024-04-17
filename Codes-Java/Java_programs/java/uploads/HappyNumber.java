import java.util.*;

public class HappyNumber {
    public static int isHappyNo(int num) {
        int rem = 0, sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Check :-  ");
        int num = sc.nextInt();
        int result = num;

        while (result != 1 && result != 4) {
            result = isHappyNo(result);
        }
        if (result == 1) {
            System.out.println(num + " Is a Happy Number");
        } else if (result == 4) {
            System.out.println(num + " Is NOT a Happy Number");
        }
        sc.close();
    }
}
