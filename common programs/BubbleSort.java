import java.util.Scanner;

class BubbleSort {
    static void bubble(int [] arr) {
        int n = arr.length;
        int temp = 0;
        for( int i = 0; i < n; i++) {
            for(int j = 1; j < (n-i); j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        BubbleSort bs = new BubbleSort();
        bs.bubble(arr);

        System.out.println("bubble sort array displaying");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}