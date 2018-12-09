

import java.util.Scanner;

class PrintAsciiValue {
	public static void main (String[] args) {
	    char c;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter String");
	    c = sc.next().charAt(0);
	    int value= c;
	  
		System.out.println("ascii value is :" +(int)c);
	}
}