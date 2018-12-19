/*   Java program to get whole and fractional parts from a double value.

                    Enter value
                    3.25
                    Whole number : 3.0
                    Fractional number : 0.25

*/

import java.util.Scanner;

class GetWholePart {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value") ;
        double number = sc.nextDouble() ;
        double fractional = number % 1;
        double wholevalue = number - fractional;
        System.out.println("Whole number : " + wholevalue);
        System.out.println("Fractional number : " + fractional);


    }
}