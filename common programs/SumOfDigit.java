import java.util.*;

class SumOgDigit {
    public static void main(String[] args) {
        int num, sum = 0, rem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        rem = num % 10;
        sum = sum + rem;
        num = num / 10;
        System.out.println("Sum of digit :" + sum);
    }
}