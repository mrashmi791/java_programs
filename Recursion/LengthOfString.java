
/* To calculate length of a String using recursion

            Enter string
            rashmi
            6

*/


import java.util.Scanner;

class LengthOfString {
   static void length(String s) {
        char ch[] = s.toCharArray();
        int count = 0;
        for(int i = 0; i< ch.length; i++) {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();
        length(s);
    }
}