import java.util.Scanner;

class CommonNumber {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[n];
        int arr2[] = new int[m];

        System.out.println("Enter array element");
        for(int i = 0; i<n; i++) {  
             arr[i] = sc.nextInt();
        }
        System.out.println("Enter array2 element");
        for(int j = 0; j < m; j++) {
             arr2[j] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <m ; j++) {
                if(arr[i] == arr2 [j]) {
                   System.out.println("common element is " +arr[i]); 
                }
            }
        }   
            
            
    } 
}