
import java.io.*;

public class CopyFileChars {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java CopyFileChars source dest");
            return;
        }
        try (FileReader fr = new FileReader(args[0]);
             FileWriter fw = new FileWriter(args[1])) {
            char[] buf = new char[4096];
            int n;
            while ((n = fr.read(buf)) != -1) fw.write(buf,0,n);
            System.out.println("Copied.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
