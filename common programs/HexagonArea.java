
import java.util.*;

class HexagonArea {
    public static void main(String[] args) {
        double side , area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        side = sc.nextInt();
        area = (6 * (side * side))/4 * (Math.tan(Math.PI/6));
        System.out.println("Area is" +area);
    }
}