
import java .util.Scanner;

class DecimalToHexa {
    public static void main(String[] ar) {

         Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number");
        int dec = sc.nextInt();
        String hexa= "";
        char d[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(dec > 0) {
            int rem = dec % 16;
            hexa = d[rem] + hexa;
            dec = dec / 16;

        }
        System.out.println(hexa);
    }
}