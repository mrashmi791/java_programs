/*  program to find square root of any number without using predefined methods.

            Enter number   33
            Square root will be 1089


*/



import java.util.Scanner;

class SquareRoot {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter number");
         int number = sc.nextInt();
         int result = number * number;
         System.out.println("Square root will be " + result);
     }
}