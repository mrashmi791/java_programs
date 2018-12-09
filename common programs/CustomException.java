class CustomException {

    public static void main(String[] args) {
        System .out.println("hello");
        try {
            show();
        }
        catch(ArithmeticException ae) {
            System.out.println("not divide by zero");
        }
    }
     static void show() throws ArithmeticException {
        System.out.println("good");
        System.out.println(5/0);

    }
}