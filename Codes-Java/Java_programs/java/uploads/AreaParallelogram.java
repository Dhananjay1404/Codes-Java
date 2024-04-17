
public class AreaParallelogram {
    int breadth, height;

    {
        breadth = 5;
        height = 7;
    }

    void area() {
        System.out.println("Area of parallelogram = " + breadth * height);
    }

    public static void main(String[] args) {
        AreaParallelogram a = new AreaParallelogram();
        a.area();

    }

}