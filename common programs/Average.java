// take 3 number and find average.
import java.util.*;

class Average {
    public static void main(String[]args) {
        int a, b, c;
        float average;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        System.out.println("Enter third number");
        c = sc.nextInt();
        average = (a + b + c)/ 3;
        System.out.println("Average is :" + average);
    }
}