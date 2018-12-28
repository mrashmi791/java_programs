import java .util.Scanner;

class DecimalTOBinary {
    public static void main(String[] ar) {

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number");
        int dec = sc.nextInt();
        String binary= "";
        while(dec > 0) {
            binary = binary + dec%2;
            dec = dec / 2;

        }
        System.out.println(binary);
    }
}