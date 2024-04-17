
public class ExceptionHandeling {
    public static void main(String[] args) {
        try {
            System.out.println("Hello " + 24 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught An Exception -> " + e);
        } catch (Exception e) {
            System.out.println("Caught An Exception -> " + e);
        } finally {
            System.out.println("Finally Block Executed");
        }
        System.out.println("Out Side Try Catch Block");
    }
}
