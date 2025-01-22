import java.util.Scanner;

public class p12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm = 0.5 * base * height;

        System.out.println("The area of the triangle is " + areaCm + " square cm.");
    }
}
