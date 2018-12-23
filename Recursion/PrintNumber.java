import java.util.Scanner;

class PrintNumber {

   static void number(int num) {
        if(num > 0) {
            number(num-1);
            System.out.println(num);
        }
    }
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        number(num);
    }
}