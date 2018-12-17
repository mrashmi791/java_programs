import java.util.Scanner;

class ArrayInsertNumber {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int arr[] = new int[n + 1];

        System.out.println("enter array size");
        int n = sc.nextInt();

        int arr[] = new int[n + 1];
    
        for (int i = 0 ; i< n ; i++) {
            arr[i] = sc.nextInt();

        }


        System.out.println("enter index position");
        int k = sc.nextInt();

        System.out.println("enter element for insert in array");
        int num = sc.nextInt();

        for (int i = n - 1; i >= k; i--) {
            arr[i + 1] = arr[i];
        }
        arr[k] = num;
        System.out.println("After inserted the element array becomes");
        for (int i = 0; i <= n ; i++) {
            System.out.print( arr[i] + " ");
        }

    }
}