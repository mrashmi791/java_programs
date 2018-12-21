/* to check whether a number is a Pronic Number or Heteromecic Number or not. 
A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
The first few pronic numbers are:
0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
*/





import java.util.Scanner;

public class PronicNumber {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
       boolean res = false;
    
        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                res = true;
                break;
            }
        }
         
        if(res)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");      
    }
}

