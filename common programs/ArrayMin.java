import java.util.Scanner;

class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i< n ; i++) {
            arr[i] = sc.nextInt();

        }
        ArrayMin m = new ArrayMin();
        int r = m.getMin(arr , n) ;
        System.out.println(r);
    }
    int getMin(int arr[] , int n) {
        int temp = arr[0];
        for(int i = 1; i <n; i++) {
            if(arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}