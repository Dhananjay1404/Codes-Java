public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 1, flag, i = 2, j;
        System.out.print("First 50 Prime Numbers Are ");
        while (count <= 50) {
            flag = 0;
            for (j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
