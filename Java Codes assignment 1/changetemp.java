import java.util.*;;
public class changetemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius = ");
        int c = sc.nextInt();
        float f = (c * 9.0f / 5) + 32;
        System.out.println("Temperature in fahrenheit is = " + f );
        
    }
}
