import java.util.Scanner;

class PrintPattern {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1 ; j <= m; j++) {
                System.out.print("-" + " ");
            }
            System.out.println();
        }
      //  System.out.println();
    }
}