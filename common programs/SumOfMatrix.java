
import java.util.*;

class SumOfMatrix {

    public static void main(String[] args) {
        int t, n, i, sum[][], a[][], b[][];

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        for (i = 0; i < t; i++) {
            n = sc.nextInt();
        }    
             a = new int[n][n];
             b = new int[n][n];
             sum = new Int[n][n];
        

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                a[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                b[j][k] = sc.nextInt();
            }
        }

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
              sum[j][k] = a[j][k] + b[j][k];
                System.out.print(sum[j][k] + "\t");
            }

            System.out.println();
        }
    }
}