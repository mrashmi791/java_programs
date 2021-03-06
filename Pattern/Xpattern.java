/*

Enter rows
5
Enter symbol
^


^   ^
 ^ ^
  ^
 ^ ^
^   ^






*/
import java.util.Scanner;

class Xpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.print("Enter symbol");
        char c = sc.next().charAt(0);

        int k = n*2-1;
        for(int i = 1; i <= k; i++) {
            for(int j = 1; j <= n; j++) {
                if(i == j || i+j == n+1) {
                    System.out.print(c);
                } else { 
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}