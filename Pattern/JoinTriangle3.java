/*

Enter row
5
    *****
   ****
  ***
 **
*
*
 **
  ***
   ****
    *****


*/

import java.util.Scanner;

class JoinTriangle3 {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
             for(int j = i; j <= n; j++) {
                  System.out.print("*");
             }
             System.out.println();
        }
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
             for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}