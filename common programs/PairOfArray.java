import java.util.Scanner;

class PairOfArray {
    public static void main(String [] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

         System.out.println("Enter element of array");
         for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();  
         }
         System.out.println("Enter sum for search in array");
         int sum = sc.nextInt();

         for(int i = 0; i < n; i++) {
             for(int j = i + 1 ; j < n; j++) {
                 if(arr[i] + arr[j] == sum) {
                     System.out.println("("+arr[i] + "," + arr[j] +")");
                    }
                }
            }
    }
}