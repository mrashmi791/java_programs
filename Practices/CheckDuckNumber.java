/*   Java program to check whether a number is a Duck Number or not.
            Input a number : 3210
            Duck number
*/



import java.util.Scanner;
class CheckDuckNumber {
    public static void main(String[] ar) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        String num = sc.nextLine();

        int count = 0; 
        int length = num.length();
        char ch;

          for(int i=1; i < length; i++) {
           ch = num.charAt(i); 
            if(ch == '0') {
                count++;
            }
        }
         char first = num.charAt(0); 
 
        if(count > 0 && first != '0')
            System.out.println("Duck number");
        else
            System.out.println("Not a duck number");
    }
}