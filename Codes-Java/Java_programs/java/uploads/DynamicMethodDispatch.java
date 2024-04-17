
class Apple {
    void display() {
        System.out.println("Inside Apple's display method");
    }
}

class Banana extends Apple {
    void display() // overriding display()
    {
        System.out.println("Inside Banana's display method");
    }
}

class Cherry extends Apple {
    void display() // overriding display()
    {
        System.out.println("Inside Cherry's display method");
    }
}

class DynamicMethodDispatch {
    public static void main(String args[]) {
        Apple a = new Apple(); // object of Apple
        Banana b = new Banana(); // object of Banana
        Cherry c = new Cherry(); // object of Cherry

        Apple ref; // taking a reference of Apple

        ref = a; // r refers to a object in Apple
        ref.display(); // calling Apple's version of display()

        ref = b; // r refers to a object in Banana
        ref.display(); // calling Banana's version of display()

        ref = c; // r refers to a object in Cherry
        ref.display(); // calling Cherry's version of display()
    }
}