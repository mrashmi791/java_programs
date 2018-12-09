import java.util.Scanner;

class DuplicateStringArray {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String arr[] = new String[n];

        System.out.println("Enter array element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].equals(arr[j]) && (i != j) ) {
                    System.out.println("common element is " + arr[j]);
                }
            }
        }
    }
}