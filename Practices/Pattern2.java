import java.util.Scanner;

class Pattern2 {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int r = sc.nextInt();
    

        for(int i = 1; i <= r; i++) {
            for(int j = 1; j <= i ;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}