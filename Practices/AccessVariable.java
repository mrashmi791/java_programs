class AccessVariable {
    int x = 11;
    static int y = 22;
    void m1() {
     System.out.println("instanance method m1");
    }
    void m2() {
        System.out.println(x);
        m1();
        // System.out.println(y);
        // m3();
          System.out.println("instanance method m2");
    }
    static void m3() {
     System.out.println("instanance method m3");
    }
    public static void main(String[] ar) {
       System.out.println(y);
       m3();
       AccessVariable a = new AccessVariable();
       System.out.println(a.x);
       a.m2(); 
    }

}