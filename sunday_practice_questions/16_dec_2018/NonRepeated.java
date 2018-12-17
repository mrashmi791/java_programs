
//to find first non-repeating element in array of integers?

import java.util.Scanner;

class NonRepeated {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean flag = false;

        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Non repeated element");
        // 2,4,4,3,5,6,2,3,8
        for (int i = 0; i < size; i++) {
            flag = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = true;
                    break;
                } 
            }

            if(!flag) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}