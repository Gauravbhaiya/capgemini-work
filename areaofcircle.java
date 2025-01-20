import java.util.*;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        int r = sc.nextInt();
        double area = Math.PI * r * r;
        System.out.printf("Area of circle is  %.2f%n" , area);
    

    }
}
