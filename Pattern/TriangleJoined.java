/*

Enter size
5
Enter symbol
#
##########
####  ####
###    ###
##      ##
#        #
#        #
##      ##
###    ###
####  ####
##########

*/

import java.util.Scanner;

class TriangleJoined {

    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter symbol");
        char ch = sc.next().charAt(0);

        int space = 0;
        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(ch);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(ch);
            }
            System.out.println();
            space = space + 2;

        }

         space = 2 * size - 2;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
            space = space - 2;

        }
    }
}