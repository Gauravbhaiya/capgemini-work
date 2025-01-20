import java.util.Scanner;

public class volumeofcyl {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius and height of the cylinder :");
        int r = sc.nextInt();
        int h = sc.nextInt();
        double vol = Math.PI * r * r *h;
        System.out.printf("Volume of cylinder is  %.2f%n" , vol);
    
}
    }
