import java.util.*;
class BinaryToDecimal {
    public static void main(String[] ar) {
        long binary, x = 1, rem, decimal =0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number");
        binary = sc.nextInt();
        while(binary != 0) {
            rem = binary % 10;
            decimal = decimal + rem * x;
            x = x * 2;
            binary = binary / 10;

        }
        System.out.println("decimal :" +decimal);

    }
}