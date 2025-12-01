
import java.util.Scanner;
public class NumberLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNo = 1;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.printf("%d %s%n", lineNo++, line);
        }
    }
}
