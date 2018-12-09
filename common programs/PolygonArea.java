import java.util.*;

class PolygonArea {
    public static void main(String[] args) {
        double side, n,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of side");
        n = sc.nextInt();
        System.out.println("Enter  length of side");
        side = sc.nextInt();
        area = ((n * (side * side)) / 4.0 * Math.tan(Math.PI/n));
        System.out.println("area is :" + area);
    }
}