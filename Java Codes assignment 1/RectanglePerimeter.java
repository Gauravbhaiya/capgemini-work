import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the perimeter
        double perimeter = 2 * (length + width);

        // Output the result
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
