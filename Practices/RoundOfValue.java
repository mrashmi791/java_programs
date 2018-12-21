import java.util.Scanner;

class RoundOfValue {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int total = 1000;
        System.out.println("Enter obtaining marks : " );
        int marks = sc.nextInt();
        System.out.println(marks);

        double result = marks / total; 
        System.out.println(Math.round(result));
        System.out.println(result);

    }
}