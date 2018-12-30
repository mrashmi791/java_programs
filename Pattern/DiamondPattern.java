/*

Enter size
5
   *

  ***

 *****

*******

*********



*/

import java.util.Scanner;

class DiamondPattern {
    public static void main(String [] arr) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        int space = size-1;
        
        for(int i = 1; i <= size; i++) {
            for(int j = 1 ; j <= space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = 1 ; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("\n\n");
        }
       
    }
}