class A {

    int i;
    A() {
    
        System.out.println("Constructor of A");
         i = 10;
    }
}

class B extends A {
    int i;

    B() {
        super();
        System.out.println("Constructor of B");
         i = 20;
    }
}

public class Practice {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
    }
}