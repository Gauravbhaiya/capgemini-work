import java.util.Scanner;

public class p9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + discountedFee);
    }
}
