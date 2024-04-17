class Area {
    void findArea(double side) {
        System.out.println("Area of the Square: " + side * side + " sq");
    }

    void findArea(double l, double b) {
        System.out.println("Area of the rectangle: " + l * b + " sq");
    }
}

public class AreaOfSquareRectangle {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.findArea(20);
        a1.findArea(40, 25);
    }
}
