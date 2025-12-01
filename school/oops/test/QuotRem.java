
import java.util.Scanner;
public class QuotRem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q = a / b;
        int r = a % b;
        System.out.println("Quotient = " + q);
        System.out.println("Remainder = " + r);
    }
}
