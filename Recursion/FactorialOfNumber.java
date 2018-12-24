/*   to find factorial of a number  using recursion in java 


               Enter number
                5
                120
*/

import java.util.Scanner;

class FactorialOfNumber {
   
   static int factorial(int num) {
      //   int fact = 1;
        if(num <= 1) {
          return 1;
        
        } else {
            return num*factorial(num-1);
        }
       
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println(fact);
    }
}