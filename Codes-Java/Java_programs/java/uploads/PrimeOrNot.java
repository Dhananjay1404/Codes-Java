import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number :- ");
        n = sc.nextInt();
        sc.close();
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                System.out.println(" Is Not A Prime Number");
                count = 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Is a Prime Number");
        }
    }
}
