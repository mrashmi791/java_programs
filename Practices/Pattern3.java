import java.util.Scanner;

class Pattern3 {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int r = 5; //sc.nextInt();
        int n = 1;
    

        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= i ;j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}