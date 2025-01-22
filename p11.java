import java.util.Scanner;

public class p11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " +
                num1 + " and " + num2 + " is " +
                (num1 + num2) + ", " +
                (num1 - num2) + ", " +
                (num1 * num2) + ", and " +
                (num1 / num2));
    }
}
