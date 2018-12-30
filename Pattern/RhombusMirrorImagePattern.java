
/*

Enter size
5
*
   *****
  *****
 *****
*****
*****



*/

import java.util.Scanner;

class RhombusMirrorImagePattern {
    public static void main(String[] arr) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter symbol");
        char ch = sc.next().charAt(0);

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= size; j++) {

                System.out.print(ch);

            }
            System.out.println();
        }

    }
}