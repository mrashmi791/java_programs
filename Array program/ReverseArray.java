import java.util.Scanner;

class ReverseArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        int arr[] = new int[n];

        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }
        System.out.println(" reverse array ");
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }
    }
}