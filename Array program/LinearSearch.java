import java.util.Scanner;

class LinearSearch {
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
           for(int i = 0; i < n; i++) {
               if(arr[i] == search) {
                   System.out.println("index is" +i);
               }
           }
          System.out.println("not found");  
    }
}