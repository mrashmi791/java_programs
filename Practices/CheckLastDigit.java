/* To accept three number by user and return true if two or more of them 
    have same rightmost digit  
                Enter first number
                56
                Enter second number
                67
                Enter third number
                76
                true
*/


import java.util.Scanner;

class CheckLastDigit {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        System.out.println("Enter third number");
        int c = sc.nextInt();

        if (a % 10 == b % 10 || a % 10 == c % 10) {
            System.out.println("true");
        } else if (b % 10 == a % 10 || b % 10 == c % 10) {
            System.out.println("true");
        }

        else
            System.out.println("false");
    }
}