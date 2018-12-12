import java.util.Scanner;

class AddDigits {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter numbers between 0 to 1000 ");
         int num = sc.nextInt();

         int sum = 0;
         while(num > 0) {
           sum = sum + num % 10;
           num = num / 10;
         }
         System.out.println("Sum of digits is : " + sum);
    }
}