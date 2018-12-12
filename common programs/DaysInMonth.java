import java.util.Scanner;

class DaysInMonth {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int month = sc.nextInt();

        System.out.println("Enter year");
        int year = sc.nextInt();
        int days;

        switch (month) {
        case 1:
            days = 31;
            System.out.println("January " + year + " has " + days + " days " );
            break;
        case 2:
            
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                days =  29;
            }
            else {
                days = 28;
            }
             System.out.println("February "+ year + " has " + days + " days ");
            break;
        case 3:
          days = 31;
            System.out.println("March " + year + " has " + days + " days");
            break;
        case 4:
        days = 30;
            System.out.println("April " + year + " has " + days + " days");
            break;
        case 5:
        days = 31;
            System.out.println("May " + year + " has " + days + " days");
            break;
        case 6:
        days = 30;
            System.out.println("June " + year + " has " + days + " days");
            break;
        case 7:
        days = 31;
            System.out.println("July " + year + " has" + days + " days");
            break;
       
        case 8:
        days = 31;
            System.out.println("August " + year + " has " + days + " days");
            break;
        
         case 9:
         days = 30;
            System.out.println("September " + year + " has " + days + " days");
            break;
        
         case 10:
         days = 31;
            System.out.println("October " + year + " has " + days + " days");
            break;
        
         case 11:
         days = 30;
            System.out.println("November " + year + " has " + days + " days");
            break;
        
         case 12:
         days = 31;
            System.out.println("December " + year + " has " + days + " days");
            break;
        
         default :
            System.out.println("wrong choice");
            
        }

    }
}