
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        for (String w : map.keySet()) {
            System.out.println(w + " = " + map.get(w));
        }
        sc.close();
    }
}
