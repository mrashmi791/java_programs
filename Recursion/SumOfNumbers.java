/*    To find the sum of digits of a number using recursion ?
                Enter number
                10
                55



*/



import java.util.Scanner;

class SumOfNumbers {
   
   static int sum(int num) {
      
        if(num > 0) {
          return num + sum(num - 1);
        
        } else {
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