/*           Print a program to print given diagram Pattern.
                Enter number of rows:	5
                Enter Symbol : .
                
                .........
                 .......
                  .....
                   ...
                    .
                





*/



import java.util.Scanner;

class ReverseTriangle {
    public static void main(String [] arr) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        
        
        for(int i = size; i >= 1; i--) {
            for(int j = 0 ; j < size - i; j++){
                System.out.print(" ");
            }
            
            for(int j = i ; j <=2*i-1; j++) {
                System.out.print(" *");
            }
            for(int j = 0 ; j < i-1; j++) {
                System.out.print(" *");
            }

            System.out.println();
            
        }
       
    }
}