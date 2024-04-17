
class UserException extends Exception {
    public UserException(String s) {
        super(s);
    }
}

public class userDefinedException {
    public static void main(String args[]) {
        try {
            if (args.length < 3) {
                throw new UserException("Less than three parameters");
            }
            System.out.println("Success without exception");
        } catch (UserException e) {
            System.out.println("User defined exception message : " + e.getMessage());
        }

    }
}