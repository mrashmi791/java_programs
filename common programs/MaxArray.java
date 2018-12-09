import java.util.Scanner;

class MaxArray {
    public static void main(String[] args) {
        int arr[] = {10,30,40}; 
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter value");
       // int n = sc.nextInt();
       // arr = new int[n];
       // for(int i =0; i < n ; i++) {
        //    arr[i]= sc.nextInt();
       // }
        int max = arr[0];
        
        if(max <= arr[2]) {
            max = arr[2];
        }
        
        
    System.out.println("larger value : " +max);
}
} 
    
