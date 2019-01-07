import java.util.Scanner;

class JoinTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int n = sc.nextInt();

        int space = n*2-1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<= space; j++) {
                System.out.println(" ");
            }
            for(int j = 1; j >= space; j++) {
                System.out.println("*");
            }
            space = space -1;
        }
         space = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j<= space; j++) {
                System.out.println(" ");
            }
            for(int j = 1; j >= space; j++) {
                System.out.println("*");
            }
            space = space + 1;
        }

    }
}