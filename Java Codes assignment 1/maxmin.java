import java.util.*;
public class maxmin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int i=0;
        System.out.println("Enter the Values..");
        while (i<5){
            int n = sc.nextInt();
            if(n<1000 && n>99){

                a[i++]= n;
            }
        }
        Arrays.sort(a);
        System.out.println("minimum number is " + a[0]);
        System.out.println("maximum number is " + a[4]);
        
    }
}
