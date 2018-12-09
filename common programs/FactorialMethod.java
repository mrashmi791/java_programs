import java.util.Scanner;

class FactorialMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FactorialMethod f = new FactorialMethod();
        int r = f.getFactorial(n);
        System.out.println(r);
    }
    int getFactorial(int x) {
        int fact = 1;
        for(int i = 1; i < x; i++) {
            fact = fact + i * x;
        }
        return fact;
    }
}