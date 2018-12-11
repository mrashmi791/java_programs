import java.util.Scanner;

class SeprateLeftRight {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements as a zero or one");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                left++;
            }

        }
        for (int i = 0; i < left; i++) {
            arr[i] = 0;
        }

        for (int i = left; i < n; i++) {
            arr[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}