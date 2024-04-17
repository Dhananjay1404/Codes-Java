
class Animal {

    // field and method of the parent class
    String name;

    void eat() {
        System.out.println("I can eat");
    }
}

// Inherit from Animal
class Dog extends Animal {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

class SingleInheritance {
    public static void main(String[] args) {

        Dog d1 = new Dog(); // create an object of the subclass

        d1.name = "puppy"; // access field of superclass
        d1.display();

        d1.eat(); // call method of superclass using object of subclass

    }
}