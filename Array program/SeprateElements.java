import java.util.Scanner;

class SeprateElements {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int j = arr.length - 1;
        System.out.println("Enter elements either negative or positive");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp;
        int i = 0;
        while(i < j) {
            if (arr[i] >= 0 && arr[j] < 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
           else if (arr[i] < 0) {
                i++;
            }
           else if (arr[j] >= 0) {
                j--;
            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}