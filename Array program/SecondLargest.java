import java.util.Scanner;

class SecondLargest {
    public static void main(String[] ar) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array");
        for(int i = 0 ; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    
        int temp;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[1]);
      
    }
}