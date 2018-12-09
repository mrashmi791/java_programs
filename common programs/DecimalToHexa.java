
import java.util.*;
class DecimalToHexa {
    public static void main(String[] args) {
        int n, rem;
        String x = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        char hexa[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9','A', 'B', 'C', 'D', 'E', 'F'};

        while(n > 0) {
            rem = n % 16;
        
            x = hexa[rem] + x;
            n = n / 16;
        }
        System.out.println("Hexadecimal number  :" + x);

    }
}