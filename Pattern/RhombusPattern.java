/*

Enter size
5
*****
 *   *
  *   *
   *   *
    *****

*/

import java.util.Scanner;

class RhombusPattern {
    public static void main(String[] arr) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < size + i; j++) {
                if (j >= i) {
                    if (i == 1 || j == i || i == size || j == size + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}