import java.util.Scanner;

class SumOfNumber {

   static int sum (int num) {
     
        if(num > 0) {
           return num + sum(num-1);
           
        }
        else {
            return num;
        }
    
    }   
    
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int res = sum(num);
       System.out.println(res);
    }
}