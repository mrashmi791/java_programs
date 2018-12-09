/*package whatever //do not write package name here */

import java.util.Scanner;


class GFG {
    
 
   void add() {
   
  Scanner sc = new Scanner(System.in);
   
    // System.out.println("Enter 1 value");
 
       int a = sc.nextInt();
       
// System.out.println("Enter 2 value");

        int b = sc.nextInt();
        
int c = a+b;
  
         System.out.println("Addition is :" +c);
    
}
    
  
  void sub(int x, int y) {
 
       int z = x-y;
  
      System.out.println("Substraction is :" +z);
  
  }
  
  
    int mul() {
 
     Scanner sc = new Scanner(System.in);
   
    // System.out.println("Enter 1 value");
    
    int a = sc.nextInt();  
         
      
  //System.out.println("Enter 1 value");
      
  int b= sc.nextInt();
     
   int c = a * b;
     
   return c;
   
 }
    


	public static void main (String[] args) {

	    GFG ad = new GFG();
	    
	    
	
    Scanner sc = new Scanner(System.in);
      
 // System.out.println("Enter 1 value");
       
 int m = sc.nextInt();
        
      
  //System.out.println("Enter 2 value");
   
     int n = sc.nextInt();
        
		
System.out.println("enter choice");
		
int ch = sc.nextInt();
		
	
	switch(ch) {
	
	    
		   
 case 1 : ad.add();
		
            break;
		            

		    case 2 : ad.sub(m,n);
	
	            break;
		            

		    case 3 : int res = ad.mul();
	
	     System.out.println("multiply is :" +res);
	
	            break;        
		   
         
		    default : System.out.println("wrong choice");
	
	            break;
		
}
	
}

}