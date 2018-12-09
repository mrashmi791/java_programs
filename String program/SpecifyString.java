import java.util.Scanner;


class SpecifyString {
    public static void main(String[] ar) {
         Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        //String str2 = sc.nextLine();

        System.out.println("search string");
        String search = sc.nextLine();

        System.out.println(str.contains(search));
    }
}