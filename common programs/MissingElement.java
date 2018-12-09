import java.util.Scanner;

class MissingElement {
    static int missing(int [] arr, int total) {
        int sum1 = total * ((total+ 1) /2);
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++) {
            sum2 = sum2 + i;

        }
        return sum1 - sum2;
    }
    public static void main(String [] ar) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        MissingElement me = new MissingElement();
        int number = me.missing(arr,n);
        System.out.println(number);
    }
}