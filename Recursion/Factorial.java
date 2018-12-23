class Factorial {
   static int fact(int x) {
        if(x <= 1) {
        return 1;
        } else {
            return x*fact(x-1);
        }
    }
    public static void main(String[] ar) {
        int num = 5;
        int res = fact(5);
        System.out.println(res);
    }
}