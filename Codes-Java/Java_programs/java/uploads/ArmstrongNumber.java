import java.util.*;

class ArmstrongNumber {
    public static void main(String args[]) {
        int n, sum = 0, temp, r;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an armstrong number");
        n = sc.nextInt();
        sc.close();
        temp = n;

        while (temp != 0) { // Because Armstrong Number can not be zero
            r = temp % 10; // Get The No Of Digits
            sum = sum + r * r * r; // we got sum
            temp = temp / 10;
        }

        if (n == sum)
            System.out.println("Entered number is an armstrong number.");
        else
            System.out.println("Entered number is not an armstrong number.");
    }
}