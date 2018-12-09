
import java.util.*;
class Swap {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swaped number \n" + a   + b);
    }
}