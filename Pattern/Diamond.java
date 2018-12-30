/*

Enter number of rows: 5
Enter Symbol : *
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *  
 


*/

import java.util.Scanner;

class Diamond {
    public static void main(String [] arr) {
        int space = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
         space = size-1;
        
        for(int i = 1; i <= size; i++) {
            for(int j = 1 ; j <= space; j++){
                System.out.print(" ");
            }
            space--;
            for(int j = 1 ; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for(int i = 1; i <= size - 1; i++) {
            for(int j = 1 ; j <= space; j++){
                System.out.print(" ");
            }
            space++;
            for(int j = 1 ; j <= 2*(size-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}