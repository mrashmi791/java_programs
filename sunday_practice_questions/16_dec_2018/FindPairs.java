
/* 1. to find all pairs on integer array whose sum is equal to given number?
        Enter array size
        5
        Enter target
        7
        Enter array elements
        2
        5
        6
        1
        4
        Pairs is: (2 ,5)
        Pairs is: (6 ,1)  
*/







import java.util.Scanner;

class FindPairs {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter target");
        int number = sc.nextInt();

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size; j++) {
                if(arr[i] + arr[j] == number) {
                    System.out.println("Pairs is: " + "(" + arr[i] + " ," + arr[j] + ")");
                }
            }
        }
    }
}