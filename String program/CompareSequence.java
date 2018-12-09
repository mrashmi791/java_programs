import java.util.Scanner;

class CompareSequence {
    public static void main(String[] ar) {
         Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();

        CharSequence s = str;
        //boolean res = str.compareTo(str2);

        System.out.println(str.contentEquals(s));
        System.out.println(str2.contentEquals(s));

    }
}