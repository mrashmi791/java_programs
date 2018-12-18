import java.util.Scanner;

class SumOfPrime {
    public static void main(String[] ar) {
        // Scanner sc= new Scanner(System.in);
        int sum = 0;
        int n = 1;
        int count = 0;

        while (count < 100) {

            if (n %2 != 0 && isPrime(n)) {
                sum = sum + n;
                count++;
            }
            n += 2;
        }
        sum = sum + 2;
        System.out.println(sum);
        System.out.println(count);
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
