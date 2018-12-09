import java.util.Scanner;

class LinearSearchUsingMethod {
    static int linearMethod(int [] arr, int search) {
        int m= arr.length;
         for(int i = 0; i < m ; i++) {
               if(arr[i] == search) {
                   return i;
               }
           }
          return -1;
    }
    public static void main(String[] ar) {
          Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element of array");
         for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();  
            }
            System.out.println("Enter Searching element of array");  
           int search = sc.nextInt();
           LinearSearchUsingMethod ls = new LinearSearchUsingMethod();
           int res = ls.linearMethod(arr,search);
           System.out.println("index is" + res);
    }
}
    
