import java.util.Scanner;

class EndsString {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String str2 = sc.nextLine();

         System.out.println("String end with");
         String end = sc.nextLine();

        //String end = "s";

        boolean res1 = str.endsWith(end);
        boolean res2 = str2.endsWith(end);

        System.out.println(res1);
        System.out.println(res2);
    }
}