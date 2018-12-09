import java.util.Scanner;

class FindSquare {
    public static void main(String [] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int base = sc.nextInt();
         System.out.println("enter power");
        int power = sc.nextInt();
        int result = 1;
        while(power != 0) {
           result = result * base;
           power--; 
        }
        System.out.println(result);
    }
}