import java.util.Scanner;

class EqualArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr2[] = new int[n];

        boolean result = true;
        System.out.println("Enter first array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter second array element");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    result = false;
                }
            }
        }

        else {
            result = false;
        }
        if (result) {
            System.out.println("array are equal");
        } else {
            System.out.println("array are not equal");

        }
    }
}
