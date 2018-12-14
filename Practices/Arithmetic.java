class Add {
    void m1(int x, int y) {
        int sum = x + y;
        System.out.println("sum : " + sum);
    }

}
class Multiply extends Add {
    void m2(int x, int y) {
        System.out.println("multiply : " + x*y);
    }
}
class Arithmetic {
    public static void main(String[] ar) {
        int a= 5;
        int b = 10;
     Multiply m = new Multiply();
     m.m1(a,b);
     m.m2(a,b);
    }
}