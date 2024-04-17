
public class PrintingNumbersWithoutLoop {
    public static void printNo(int n) {
        if (n <= 100) {
            System.out.println(n + "");
            printNo(n + 1);
        }
    }

    public static void main(String[] args) {
        printNo(1);
    }
}
