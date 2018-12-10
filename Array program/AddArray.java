import java.util.Scanner;

class AddArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
         int arr2[][] = new int[m][n];
         int sum[][] = new int[m][n];


        System.out.println("enter first array element");
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
               arr[i][j] = sc.nextInt();
            }
        }
         System.out.println("enter second array element");
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
               arr2[i][j] = sc.nextInt();
            }
        }    
         int j;
         System.out.println("Sum of the matrices :");
        for(int i = 0; i< m; i++) {
            for( j = 0; j <n; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(sum[i][j] + "\t");
                System.out.println();
            }
            //System.out.print(sum[i][j] + "\t");
        }
      // System.out.println();
    }
}