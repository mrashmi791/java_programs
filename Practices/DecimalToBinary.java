import java.util.Scanner;

class DecimalToBinary {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        int count = 0;
        String x = "";

        while(number > 0) {
            int a = number % 2;
            if(a == 0) {
                count++;
            }
            x = x + "" + a;
            number = number/2;
        }
        System.out.println("Binary number : " + x) ;
          System.out.println("Total number of 0 : " + count) ;
        
        
    }
}