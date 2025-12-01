
abstract class Shape {
    abstract int numberOfSides();
}

class Trapezoid extends Shape {
    int numberOfSides() {
        return 4;
    }
}

class Triangle extends Shape {
    int numberOfSides() {
        return 3;
    }
}

class Hexagon extends Shape {
    int numberOfSides() {
        return 6;
    }
}

public class MainShape {
    public static void main(String[] args) {
        Shape s;

        s = new Trapezoid();
        System.out.println("Trapezoid has " + s.numberOfSides() + " sides.");

        s = new Triangle();
        System.out.println("Triangle has " + s.numberOfSides() + " sides.");

        s = new Hexagon();
        System.out.println("Hexagon has " + s.numberOfSides() + " sides.");
    }
}
