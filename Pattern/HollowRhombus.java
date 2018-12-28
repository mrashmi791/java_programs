/*                      Enter number of rows:	10
                        Enter Symbol : *
 
                          **********
                           *        *
                            *        *
                             *        *
                               *        *
                                 *        *
                                   *        *
                                     *        *
                                       *        *
                                        **********





*/





import java.util.Scanner;

class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter symbol");
        char c = sc.next().charAt(0);

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j < n + i; j++) {
                if(j >= i) { 
                    if(i == 1 || i == j || j == n + i - 1 || i == n) { 
                System.out.print(c);
                } 
                else {
                    System.out.print(" ");
                }
            }
           
        }
        System.out.println();
    }
    }
}