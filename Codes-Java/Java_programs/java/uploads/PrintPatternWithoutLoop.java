
class PrintPatternWithoutLoop {

    // function to print a row
    static void printn(int num) {
        // base case
        if (num == 0) // stop recursion when num is 0
            return; // return value null, mean terminate the block
        else {
            printn(num - 1); // recursively calling pattern method
            System.out.print(" * ");
        }

    }

    // function to print the pattern
    static void pattern(int n, int i) {
        // base case
        if (n == 0)
            return;
        printn(i);
        System.out.println();

        pattern(n - 1, i + 1); // recursively calling pattern method
    }

    public static void main(String[] args) {

        int n = 5;
        pattern(n, 1);
    }
}
