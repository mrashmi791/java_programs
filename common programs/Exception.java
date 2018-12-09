class Exception {
    public static void main(String [] ar) {
        System.out .println("hii");
        int a = 5;
            int b = 0;
            int x = a + b;
            System.out.println(x);
        try {
            //int m = 5;
            //int n = 0;
            int c = x/0;
            
            System.out.println(c);
           // System.out.println(x);
        }
        catch (ArithmeticException ae) {
            ae.printStackTrace();
            
        }
        finally {
            System.out.println("thank u");
        }
        
    }
}