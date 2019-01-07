/*

Enter rows
5
    +
    +
    +
    +
+++++++++
    +
    +
    +
    +

*/

import java.util.Scanner;

class PrintPlusSign {
    public static void main(String[] arr) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter rows");
       int n = sc.nextInt();

        for(int i = 1; i<= n*2-1; i++) {
            for(int j = 1; j <= n*2-1; j++) {
                if( j == n  || i == n) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}