import java.util.Scanner;

class AreaCalculator {

    // Method to calculate the area of a circle
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public int area(int length, int width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class CalculateAreaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();
        System.out.println("Area of the circle: " + calc.area(radius));

        // Calculate area of rectangle
        System.out.println("Enter length and width of the rectangle:");
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("Area of the rectangle: " + calc.area(length, width));

        // Calculate area of triangle
        System.out.println("Enter base and height of the triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of the triangle: " + calc.area(base, height));

        sc.close();
    }
}
