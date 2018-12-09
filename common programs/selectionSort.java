import java.util.Scanner;

class SelectionSort {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for(int i =0; i<n; i++ ) {
            arr[i] = sc.nextInt();

        }

        for( int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted array displaying");
        for(int i=0;i<n; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}