import java.util.Scanner;

class FindZero {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int m = sc.nextInt();

        int arr[] = new int[m];

        System.out.println("enter array element");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < m; i++) {

            if (arr[i] == 0 || arr[i] == -1) {
                count++;

            }
        }
        if (count != 0) {
            System.out.println("Array with 0 or -1");
        } else {
            System.out.println("Array without 0 or -1");
        }
    }
}