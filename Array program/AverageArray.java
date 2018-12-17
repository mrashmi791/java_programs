import java.util.Scanner;

class AverageArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int m = sc.nextInt();

        int arr[] = new int[m];

        System.out.println("enter array element");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];

        for (int i = 1; i < m; i++) {
            sum = sum + arr[i];
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        int sum1 = max + min;

        float result = ((sum - sum1) / m - 2);
        System.out.println("Average sum is " + result);
        
    }
}