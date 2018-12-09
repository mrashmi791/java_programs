import java.io.*;

class Remainder {
    public static void main(String[] args) {
     int a = 19;
     int b = 7;
     Remainder ad = new Remainder();
     int result = ad.value(a,b);
     System.out.println(result);   
    }
    int value(int x, int y) {
        int divided = x/ y;
        int rem = x - (divided * y);
        return rem;
    }
}