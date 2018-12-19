/* Java program to test if a double number is an integer. 
             Enter number :
             44.560
             Number is not integer
*/




import java.util.Scanner;

class CheckInteger {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number :");
        double number = sc.nextDouble();
        if(number % 1 == 0) {
            System.out.println("Number is integer");
        }
        else{
            System.out.println("Number is not integer");
        }
    }
}