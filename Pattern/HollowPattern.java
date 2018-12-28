/*          Enter number of rows:	5
      Enter Symbol : *
    *****
   *   *
  *   *
 *   *
*****


*/



import java.util.Scanner;

class HollowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();
        System.out.println("Enter symbol");
        char c = sc.next().charAt(0);

        for(int i = 1; i <= n; i++) {
            for(int j = 1 ; j < n- i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++ ) {
                if(i == 1 || i == n || j == 1 || j == n ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" "); 
                }
            }
          
        
          
        System.out.println();
    }
    }
}