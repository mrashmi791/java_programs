/*
Enter size
5
Enter symbol
.
.
..
. .
.  .
.....






*/

import java.util.Scanner;

class HollowTriangle {
    public static void main(String[] arr) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();

        System.out.println("Enter symbol");
        char c = sc.next().charAt(0);


        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == i || i == size || i == 1 && j == 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }
}