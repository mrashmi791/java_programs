import java.util.Scanner;

class ConvertMinutesIntoYear {
    public static void main(String [] ar) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Enter minutes ");
         int m = sc.nextInt();

         int minutesInYear = 60 * 24 * 365;
         int y = m / minutesInYear ;
         int d = (m % minutesInYear ) / 1440;
          System.out.println("year/day/minutes : " + y + " year  and  " + d + " days" );
    }
}