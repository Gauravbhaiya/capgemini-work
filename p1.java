import java.util.*;
class p1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give your Date of birth - ");
        int byear = sc.nextInt();
        int curyear= 2024;
        int age = curyear-byear;
        System.out.println("your age is " + age);


    }
}