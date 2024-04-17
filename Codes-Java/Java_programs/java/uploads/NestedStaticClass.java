
class MotherBoard {

    // static nested class
    static class Members {
        int male = 2;
        int female = 1;

        int getTotalPorts() {
            return male + female;
        }
    }

}

public class NestedStaticClass {
    public static void main(String[] args) {
        // create an object of the static nested class
        // using the name of the outer class
        MotherBoard.Members usb = new MotherBoard.Members();
        System.out.println("Total Members = " + usb.getTotalPorts());
    }
}