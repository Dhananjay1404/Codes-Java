public class PrimeNonPrime {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 12, 45, 7, 89, 5, 4, 1 };
        int cnt = 0;
        int ncnt = 0;
        int prime[] = new int[10];
        int notprime[] = new int[10];
        for (int v : arr) {
            int i, m = 0;
            m = v / 2;
            if (v == 0 || v == 1) {
                continue;
            } else {
                for (i = 2; i <= m;) {
                    if (v % i == 0) {
                        notprime[ncnt] = v;
                        ncnt++;
                        break;
                    } else {
                        prime[cnt] = v;
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.print("Prime array : ");
        for (int r = 0; r < cnt; r++) {
            System.out.print(prime[r] + " ");
        }
        System.out.println("");
        System.out.print("Not Prime array : ");
        for (int r = 0; r < ncnt; r++) {
            System.out.print(notprime[r] + " ");
        }
    }
}