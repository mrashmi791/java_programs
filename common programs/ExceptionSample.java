import java.util.Scanner;

class ExceptionSample {
    public static void main(String[] ar) {
        try {
        Scanner sc = new Scanner(System.in);
        System.out.println("hii");
        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
       
            System.out.println("show the array element");

            System.out.println(arr[6]);
        } 
        catch (ArithmeticException ae) {
            ae.printStackTrace();

        }

        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();

        } finally {
            System.out.println("thank u");
        }

    }
}