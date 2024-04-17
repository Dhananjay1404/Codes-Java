abstract class Book {
    String title;

    abstract void setTitle(String s);
}

class myBook extends Book {
    void setTitle(String s) {
        title = s;
    }

    String getTitle() {
        return title;
    }
}

public class AbstractClassDemon2 {
    public static void main(String[] args) {
        myBook b1 = new myBook();
        b1.setTitle("The Complete Reference");
        b1.getTitle();
        System.out.println("Book : " + b1.title);
    }
}
