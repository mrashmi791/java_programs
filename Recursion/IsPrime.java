import java.util.Scanner;

class IsPrime {
    int check(int num,int i) {
        if(num > 100) {
            return num;
        }
        return check(num - 1,i);
           
  }

  
    int prime() {
        if(i==1) {
            return 1;
        }
         if(x%i==0) {
            return 0;
    }
    else {

        return prime(x-1, i);
        }
    }
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        IsPrime p = new IsPrime();
        int x = p.check(n,2);

        if(x == 1) {
            System.out.println("Number is prime");
        }
        else {
            System.out.println("Number is not prime");
        }

    }
}