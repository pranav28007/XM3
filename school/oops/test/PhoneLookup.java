
import java.io.*;
import java.util.*;

public class PhoneLookup {
    public static void main(String[] args) throws IOException {
        if (args.length == 0) { System.err.println("Usage: java PhoneLookup datafile"); return; }
        Map<String,String> nameToPhone = new HashMap<>();
        Map<String,String> phoneToName = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length >= 2) {
                    nameToPhone.put(parts[0].trim(), parts[1].trim());
                    phoneToName.put(parts[1].trim(), parts[0].trim());
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name or phone: ");
        String q = sc.nextLine().trim();
        if (nameToPhone.containsKey(q)) System.out.println("Phone: " + nameToPhone.get(q));
        else if (phoneToName.containsKey(q)) System.out.println("Name: " + phoneToName.get(q));
        else System.out.println("Not found.");
    }
}
