
import java.util.Scanner;
public class CylinderVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: "); double r = sc.nextDouble();
        System.out.print("Height: "); double h = sc.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.printf("Volume = %.4f%n", volume);
    }
}
