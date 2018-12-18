import java.util.Scanner;

class HalfString {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2= str1.substring(0, str1.length() / 2);

        //for(int i = 0; i < (str1.length() / 2); i++) {
        //    str2 = str2 + str1.charAt(i);
        //}

        System.out.println(str2);
  
    }
}