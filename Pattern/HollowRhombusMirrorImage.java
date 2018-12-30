/*

Enter size
5
Enter symbol
&
   &&&&&
  &   &
 &   &
&   &
&&&&&



*/

import java.util.Scanner;

class HollowRhombusMirrorImage {
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

                if (i == 1 || j == 1 || i == size || j == size) {
                    System.out.print(ch);
                }

                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}