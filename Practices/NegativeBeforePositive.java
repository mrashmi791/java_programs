/*  to move every positive number to the right and every negative number to the left of a given array of integers.


                    Enter array size
                    5
                    Enter array elements
                    3
                    -2
                    0
                    -55
                    -4
                    -4 -2 -55 0 3
*/

import java.util.Scanner;

class NegativeBeforePositive {
    public static void main(String[] ar) {
         Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];

         System.out.println("Enter array elements");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            
        }
        int temp;
        int i = 0;
        int j = arr.length-1;
        while(i < j) {
            if(arr[i] >= 0 && arr[j] < 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            else if(arr[i] < 0) {
                i++;
            }
            else if (arr[j] > 0) {
                j--;
            }
            
        }
        for(int k = 0; k < size; k ++) {
                System.out.print(arr[k] + " ");
            }
    }
}