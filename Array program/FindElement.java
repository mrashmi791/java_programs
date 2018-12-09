import java.util.Scanner;

class FindElement {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in) ;

        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter array element");
        for(int i = 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter value for searching");
        int search = sc.nextInt();

            boolean result = false;
            int i;
        for( i = 0; i < n ; i++) {
            if(arr[i] == search) {
                result = true;
                break;
               // System.out.println("found element at index : " + i);
            }
           
        }
        if(result) {
            System.out.println("found element at index : " +  i);
        }
        else {
            System.out.println("not found"); 
        }
       
    }
}