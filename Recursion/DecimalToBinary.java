/*   Convert decimal number to binary using recursion in java 


                Enter string
                rashmi
                6
*/

import java.util.Scanner;

class DecimalToBinary {
   static String binary="";
   static void Decimal(int num) {
        
        while(num>0) {
            binary = binary + num%2;
            num = num/2;
        
        }
        System.out.println(binary);
    }

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        Decimal(num);
    }
}