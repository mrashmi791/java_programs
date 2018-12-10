import java.util.Scanner;

class CountEvenOdd {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int m = sc.nextInt();
        int arr[] = new int[m];
         
        System.out.println("enter array element");
        for (int i = 0; i < m; i++) {
               arr[i] = sc.nextInt();
        }
         
         int even = 0;
         int odd = 0;
         
        for(int i = 0; i< m; i++) {
                if(arr[i] % 2 == 0){
                    even++;
                }
                else {
                    odd++;
                }
                
        }
         System.out.println("Total even number is :" + even);
          System.out.println("Total odd number is : " +odd);
    
    }
}