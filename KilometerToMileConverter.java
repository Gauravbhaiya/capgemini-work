import java.util.Scanner;

public class KilometerToMileConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers * 0.621371;

        // Print the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        // Close the scanner
        scanner.close();
    }
}
