import java.util.*;

class UniqueNumber {
    public static void main(String[] ars) {
        int count = 0;
        for(int i = 1; i < 4; i++) {
            for(int j = 1; j <= 4 ; j++) {
                for(int k = 1; k<= 4; k++) {
                 if(k != i && k !=j || i != j ) {
                     count++;
                     System.out.print(i+""+j+""+k);
                 }   
                }
            }
        }
        System.out.println("total" +count);
    }
}