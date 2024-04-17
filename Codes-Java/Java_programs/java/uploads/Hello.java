/*
START
Step 1 -> function int printpattern(int n)
   If n>0
      Printpattern(n-1)
      Print *
   End IF
End
Step 2 -> function int pattern(int n)
   If n>0
      pattern(n-1)
   End IF
   Printpattern(n)
   Print \n
End
STOP 
*/

public class Hello {
    void patternPrint(int n) {
        if (n > 0) {
            patternPrint(n - 1);
            System.out.print("*");
        }
    }

    void pattern(int n) {
        if (n > 0) {
            pattern(n - 1); // will recursively print the pattern
        }
        patternPrint(n); // will reduce the n recursively.
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int n = 5;
        Hello h1 = new Hello();
        h1.pattern(n);
    }
}