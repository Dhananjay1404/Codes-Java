class Customer {
    int cust_num, cust_age, contact_num;

    Customer(int a, int b, int c) {
        cust_num = a;
        cust_age = b;
        contact_num = c;
        System.out.println("Parameterized Constructor Invoked");
    }

    Customer() {
        cust_num = 1;
        cust_age = 21;
        contact_num = 83088787;
        System.out.println("Default Constructor Invoked");
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Customer c1 = new Customer(2, 25, 789875);

        System.out.println("Cust Num :" + c1.cust_num);
        System.out.println("Cust Num :" + c1.cust_age);
        System.out.println("Cust Num :" + c1.contact_num);
        System.out.println();

        Customer c2 = new Customer();

        System.out.println("Cust Num :" + c2.cust_num);
        System.out.println("Cust Num :" + c2.cust_age);
        System.out.println("Cust Num :" + c2.contact_num);
    }
}
