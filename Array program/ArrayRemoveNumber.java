import java.util.Scanner;

class ArrayRemoveNumber {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array element");
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter element for remove in array");
        int r = sc.nextInt();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == r) {
               for(int j = i;j < n-1; j++) {
                   arr[j] = arr[j+1];
               }
               count++;
               break;

            }
        }
        if(count == 0) {
            System.out.println("not found");
        }
        else {
            for(int i = 0; i < n-1; i++) {
                System.out.println(arr[i] + " ");  
            }
        }
        
    }
}