/*    To form the Fibonacci series using recursion 
            Enter number
                5
                1 1 2 3 5 8 13

*/

import java.util.Scanner;

class Febonacci {
   
    int a, b, c;
    void fibo(int num) {
      
        if(num >= 1) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
            fibo(num - 1);
        } 
       
    }

    public static void main(String[] ar) {
        Febonacci f = new Febonacci();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        f.a = 1;
        f.b = 1;
        
        System.out.print(f.a + " " + f.b);
        f.fibo(num);
        sc.close();
    }
}