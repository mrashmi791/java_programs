import java.util.Scanner;

class CountEvenOdd {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
         

        System.out.println("enter array element");
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
               arr[i][j] = sc.nextInt();
            }
        }
         
         int even = 0;
         int odd = 0;
         //System.out.println("Sum of the matrices :");
        for(int i = 0; i< m; i++) {
            for(int j = 0; j < n; j++) {
                if(arr[i][j] % 2 == 0){
                    even++;
                }
                else {
                    odd++;
                }
                
            }
            
        }
         System.out.println("Total even number is :" + even);
          System.out.println("Total odd number is : " +odd);
    
    }
}