/*

Enter first number
5
Enter second number
9
After Swaping the number 9 5


*/

import java.util.Scanner;

class SwapNumber {
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swaping the number "+ num1 + " " + num2);
    }
}