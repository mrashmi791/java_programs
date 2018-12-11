import java.util.Scanner;

class ArrangeEvenOdd {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int m = 0;

        System.out.println("enter array element");
        for (m = 0; m < n; m++) {
            arr[m] = sc.nextInt();
        }

        int i = 0;
        int j = arr.length - 1;
        
        while (i < j) {
            if (arr[i] % 2 == 0 && i < j) {
                i++;
            } else {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}