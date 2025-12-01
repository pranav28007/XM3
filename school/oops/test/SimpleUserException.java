

class MyException extends Exception {
    MyException(String msg) {
        super(msg);
    }
}

public class SimpleUserException {
    public static void main(String[] args) {
        try {
            int x = -5;

            if (x < 0) {
                throw new MyException("Number should not be negative!");
            }

            System.out.println("Number: " + x);
        }
        catch (MyException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
