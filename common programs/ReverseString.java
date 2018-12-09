import java.util.*;
class ReverseString {
    public static void main(String[] args) {
        String str, rev = "";
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int l = str.length();
        for(int i = l - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
            System.out.println(rev);
        }
    }
}