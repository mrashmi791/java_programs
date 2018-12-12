import java.util.Scanner;

class ChangeIntoCelsius {
    public static void main(String[] ar) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter temperature in farenheite ");
         int far = sc.nextInt();

         int cel = ((far - 32) * 5) / 9;
         System.out.println("Temperature in celsius : " + cel);

    }

}