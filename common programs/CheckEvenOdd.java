import java.util.Scanner;

class CheckEvenOdd {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int num = sc.nextInt();
        if(num % 2 ==0) {
           System.out.println("Number is even" + num); 
        }
        else {
            System.out.println("Number is not even" + num);
        }
    }
}