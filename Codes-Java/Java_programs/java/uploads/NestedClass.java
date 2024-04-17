
class CPU {

    // nested class
    class Processor {
        double getCache() {
            return 4.3;
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        // create object of Outer class CPU
        CPU cpu = new CPU();
        // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();
        System.out.println("Processor Cache = " + processor.getCache());
    }
}