
import java.util.*;
class DecimalToOctal {
    public static void main(String[] args) {
        int n, rem;
        String x = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n = sc.nextInt();
        char oct[] = {'0', '1', '2', '3', '4', '5', '6', '7'};

        while(n > 0) {
            rem = n % 8;
        
            x = oct[rem] + x;
            n = n / 16;
        }
        System.out.println("octal number  :" + x);

    }
}