/* To reverse a String using recursion
            Enter string
            rashmi
            imhsar

*/


import java.util.Scanner;

class ReverseString {
        static String temp = "";
    static void reverse(String s) {
    
       int length = s.length();
        for(int i = length - 1; i >= 0 ; i--) {
           temp = temp + s.charAt(i);
        }
      
        System.out.println(temp);

    }
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter string");
        String s = sc.nextLine();
        reverse(s);
    }
}