import java.util.Scanner;

class FindLargest {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
       
        System.out.println("Enter number of largest value");
        int k = sc.nextInt();

        int temp ;
        System.out.println("Enter array elements");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
        }
        for(int i = 0; i < size; i++) {
           for(int j = i+1; j < size; j++) {
            if(arr[i] < arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
           } 
           
        }
        for(int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}