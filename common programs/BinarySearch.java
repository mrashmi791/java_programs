import java.util.Scanner;

class BinarySearch{
    static void binary (int arr[],int first ,int last,int search) {
        int mid = (first+last)/2;
        while(first <= last) {
            if(arr[mid]< search) {
                first = mid + 1;
            }
            else if(arr[mid] == search) {
                System.out.println("element at index" + mid);
                break;
            }
            else {
                last = mid -1;
            }
            mid = (first + last) /2;
        }
        if(first > last) {
            System.out.println("not found");
        }
    }
    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter searching value");
        int search = sc.nextInt();

        int last = arr.length-1;
        BinarySearch bs = new BinarySearch();
        bs.binary(arr,0,last,search);
    }
}