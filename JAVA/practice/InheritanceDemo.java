import java.util.Scanner;

// Interface for Rectangle
interface Rectangle {
    double calculateRectangleArea(double length, double breadth);
}

// Interface for Triangle
interface Triangle {
    double calculateTriangleArea(double base, double height);
}

// Class implementing both interfaces (Multiple Inheritance)
class AreaCalculator implements Rectangle, Triangle {

    public double calculateRectangleArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = scanner.nextDouble();

        double rectArea = calc.calculateRectangleArea(length, breadth);
        System.out.println("Area of Rectangle: " + rectArea);

        // Triangle input
        System.out.print("Enter base of triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = scanner.nextDouble();

        double triArea = calc.calculateTriangleArea(base, height);
        System.out.println("Area of Triangle: " + triArea);

        scanner.close();
    }
}
