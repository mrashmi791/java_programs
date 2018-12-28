/*   Print Mirrored Rhombus Star Pattern.
	        Enter number of rows:	6
            Enter Symbol : *
                ******
                 ******
                  ******
                   ******
                     ******
                      ******
 
 

               
 */





import java.util.Scanner;

class Rhombus {
    public static void main(String [] arr) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int size = sc.nextInt();
        char ch = sc.next().charAt(0);
        
        
        for(int i = 1; i <= size; i++) {
            for(int j = 1 ; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j < size + i; j++) {
                if( j >= i) {
        
                        System.out.print(ch);
                    
                } else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        
    }
}