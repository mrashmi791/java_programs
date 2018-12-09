class ExceptionString {
    String str = "a";

    void A() {
        try {
            str += "b";
            B();
        } catch (Exception e) {
            str += "c";
        }
    }

    void B() throws Exception {
        try {
            str += "d";
        
        } catch (Exception e) {
            throw new Exception();
        } finally {
            str += "e";
        }

        str += "f";

    }

    void display() {
        System.out.println(str);
    }

    public static void main(String[] args) {
        ExceptionString ex = new ExceptionString();
        ex.A();
        ex.display();
    }

}
