import java.util.Scanner;

class ArrayIndex {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

            System.out.println("Original array is");
         for(int i = 0 ; i <arr.length; i++) {
             System.out.print(arr[i] + " ");
         }

         int index = 1;
         for(int i = 0; i<arr.length -1; i++) {
             if(arr[i] != arr[i+1]) {
                 arr[index++] = arr[i];
             }

         }
         System.out.println("New array index" +index);
    }
}