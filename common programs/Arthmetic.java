import java.util.*;

class Arthmetic {
    public static void main(String[] args) {
        int a, b, sum, sub, mul;
        int div, rem;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter First number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sum = a + b;
        sub = a - b;
        mul = a * b;
        div = a / b;
        rem = a % b;
        System.out.println(sum + " \n" + sub + "\n" + mul + "\n" + div + "\n" + rem);
    }
}