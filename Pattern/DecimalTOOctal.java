import java .util.Scanner;

class DecimalTOOctal {
    public static void main(String[] ar) {

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number");
        int dec = sc.nextInt();
        String octal= "";
        char d[] = {'0','1','2','3','4','5','6','7'};
        while(dec > 0) {
            int rem = dec % 8;
            octal = d[rem] + octal;
            dec = dec / 8;

        }
        System.out.println(octal);
    }
}