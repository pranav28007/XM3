
class OverloadExample {

    int a, b;


    OverloadExample() {
        a = 0;
        b = 0;
    }


    OverloadExample(int x, int y) {
        a = x;
        b = y;
    }


    void display() {
        System.out.println("Values: a = " + a + ", b = " + b);
    }

    void display(String msg) {
        System.out.println(msg + ": a = " + a + ", b = " + b);
    }
}

public class ConstructorMethodOverload {
    public static void main(String[] args) {

        OverloadExample obj1 = new OverloadExample();
        OverloadExample obj2 = new OverloadExample(5, 10);

        obj1.display();
        obj2.display("Parameterized Constructor Output");
    }
}
