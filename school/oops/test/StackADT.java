
import java.util.Scanner;

class Stack {
    int max = 5;
    int top = -1;
    int stack[] = new int[max];

    void push(int item) {
        if (top == max - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
}

public class StackADT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();

        while (true) {
            System.out.println("\n1.Push  2.Pop  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter element: ");
                    int item = sc.nextInt();
                    s.push(item);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
