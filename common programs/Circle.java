// fina area and perimeter of circle.
import java.util.*;

class Circle {
    public static void main(String[] args) {
        double radius = 7.5;
        double area, perimeter;
        
        perimeter = 2 * Math.PI * radius;
        area  = Math.PI * radius * radius;
        System.out.println("perimeter  is = " + perimeter + "\n" + "area is =" +area);
    }
}