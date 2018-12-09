import java.util.Scanner;

class Fibonacci {
    public static void main(String [] ar) {
        int n,a=0, b=0, c = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        n = sc.nextInt();
        for(int i = 1; i <=n ; i++) {
            a=b;
            b=c;
            c= a+b;
            System.out.print(a+ " ");
        }
    }
}