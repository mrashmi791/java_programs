
import java.util.*;
class DecimalToBinary {
    public static void main(String[] args) {
        int n,  a;
        String x = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        while(n > 0) {
            a = n % 2;
        
            x = x + "" + a;
            n = n / 2;
        }
        System.out.println("Binary number  :" + x);

    }
}