//to remove duplicates from array in Java?

import java.util.Scanner;

class RemoveDuplicate {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //int arr2[] = new int[size];
        //int j = 0;
        boolean flag = false;

        System.out.println("Enter array elements");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        

        for (int i = 0; i < size; i++) {
            flag = false;
            for (int j = i+1; j < size; j++) {
                if (arr[i] == arr[j] && arr[i] != 0) {
                    arr[j] = 0;
                    flag = true;
                } 
            }

            if(arr[i] != 0) {
                System.out.print(arr[i] +" ");
            }
        }
        System.out.print("\n");
        for(int i = 0; i < size; i++) {

            if(arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
            
        }
    }
}