import java.util.Scanner;

class MissingNumber {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();

        int arr[] = new int[n];
       
        System.out.println("enter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
           
        }
        int sum = (n * (n+1)/2);
        for(int i = 0; i< arr.length +1; i++) {
            sum = sum - arr[i];
        }
       System.out.println("Missing number is :" + sum);
    }
}