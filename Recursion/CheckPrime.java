import java.util.Scanner;

class CheckPrime {
    int prime(int num, int i) {
        if(num % i == 0) {
            return -1;
        }
        if(i*i>= num) {
            return num;       
        }
        
        return prime(num, i+1);
    }


    public void displayPrimes(int i) {
        if(i > 100) {
            return;
        }

        int x = prime(i , 2);
        if(x != -1) {
            System.out.print(" "+ i);
        }

        displayPrimes(i+1);
    }
     

    public static void main(String[] ar) {
        CheckPrime p = new CheckPrime();
        System.out.print("2 ");
        p.displayPrimes(3);
    }
}