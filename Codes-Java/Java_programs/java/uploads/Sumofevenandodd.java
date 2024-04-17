import java.util.*;

public class Sumofevenandodd {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        n = sc.nextInt();
        sc.close();
        int esum = 0;
        int osum = 0;
        int rem;
        while (n > 0) {

            rem = n % 10; // for getting last digit
            if (rem % 2 == 0) {
                // System.out.println("Even Number : " + rem);
                esum = esum + rem;
            } else {
                // System.out.println("Odd Number : " + rem);
                osum = osum + rem;
            }
            n = n / 10;
        }
        System.out.println("Sum of even numbers : " + esum);
        System.out.println("Sum of odd numbers : " + osum);
    }
}