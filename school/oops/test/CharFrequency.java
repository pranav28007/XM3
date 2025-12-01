
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();  // Optional: ignore case

        int[] freq = new int[256];  // ASCII character count

        // Counting frequency
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        System.out.println("Character Frequency:");
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " → " + freq[i]);
            }
        }

        sc.close();
    }
}
