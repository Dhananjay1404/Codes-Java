abstract class Bank {
    abstract int getBalance();
}

class BankA extends Bank {
    int getBalance() {
        return 100;
    }
}

class BankB extends Bank {
    int getBalance() {
        return 150;
    }
}

class BankC extends Bank {
    int getBalance() {
        return 200;
    }
}

class AbstractMethodDemonstrate {
    public static void main(String args[]) {
        BankA b1 = new BankA();
        System.out.println("Balance in BankA : " + b1.getBalance());

        BankB b2 = new BankB();
        System.out.println("Balance in BankB : " + b2.getBalance());

        BankC b3 = new BankC();
        System.out.println("Balance in BankA : " + b3.getBalance());
    }
}
