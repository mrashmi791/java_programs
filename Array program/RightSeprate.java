 import java.util.Scanner;
 import java.util.Arrays;

 class RightSeprate {
    public static void main(String [] ar) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter element of array");
         for(int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();  
            }
            int count = n-1;
            for(int i = n-1; i >= 0; i--) {
                if(arr[i] != 0) {
                    arr[count] = arr[i];
                    count--;
                }
            }
            while(count >= 0) {
                arr[count] = 0;
                count--;
            }
            
               System.out.println(Arrays.toString(arr));
            
    }
 }