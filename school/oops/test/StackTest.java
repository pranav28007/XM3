
import java.util.ArrayList;


interface IntStack {
    void push(int item);
    int pop();
    void display();
}


class FixedStack implements IntStack {
    private int[] stack;
    private int top;
    private int capacity;

    public FixedStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}


class DynamicStack implements IntStack {
    private ArrayList<Integer> stack;

    public DynamicStack() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
    }

    public int pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack.remove(stack.size() - 1);
    }

    public void display() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}


public class StackTest {
    public static void main(String[] args) {
        System.out.println("Fixed Stack:");
        IntStack fixed = new FixedStack(5);
        fixed.push(10);
        fixed.push(20);
        fixed.push(30);
        fixed.display();
        System.out.println("Popped: " + fixed.pop());
        fixed.display();

        System.out.println("\nDynamic Stack:");
        IntStack dynamic = new DynamicStack();
        dynamic.push(100);
        dynamic.push(200);
        dynamic.push(300);
        dynamic.display();
        System.out.println("Popped: " + dynamic.pop());
        dynamic.display();
    }
}
