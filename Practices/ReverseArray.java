/* To reverse an array elements.
            Enter array size
            4
            Enter array element
            1 2 3 4
            Reverse Array
            4 3 2 1

*/
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse Array");
        for(int i = size -1; i>= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}