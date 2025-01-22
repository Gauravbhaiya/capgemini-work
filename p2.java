import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the marks in the subject Physics,Chemistry,Math");
        float p = sc.nextFloat();
        float c = sc.nextFloat();
        float m = sc.nextFloat();
        float avgp = (p+c+m)/3;
        System.out.print("Sam average marks in PCM is - " +avgp + "%");

    }
}
