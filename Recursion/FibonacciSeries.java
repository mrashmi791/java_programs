import java.util.Scanner;

class FibonacciSeries {
    static int a, b,c;
    static void fibonacci(int num) {
        if (num >= 1) {
             c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibonacci(num - 1);
        }

    }

    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
         a = 1;
         b = 1;
        System.out.print(a + " " + b);
            fibonacci(num);
    }
}