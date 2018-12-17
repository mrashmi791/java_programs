/*   To count factor of a number
        50
        5
*/


import java.util.Scanner;

class CountFactor {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int count = 0;
        for(int i = 2; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}