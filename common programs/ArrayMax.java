import java.util.Scanner;

class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i< n ; i++) {
            arr[i] = sc.nextInt();

        }
        ArrayMax m = new ArrayMax();
        int r = m.getMax(arr , n) ;
        System.out.println(r);
    }
    int getMax(int arr[] , int n) {
        int temp = arr[0];
        for(int i = 1; i <n; i++) {
            if(arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
}