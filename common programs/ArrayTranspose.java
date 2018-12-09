import java.util.Scanner;
class ArrayTranspose {

public static void main (String [] ar) {
Scanner sc = new Scanner (System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  int arr[][] = new int[m][n];
  int i,j ;

	for(i = 0 ; i < m ; i ++) {
	  for(j = 0; j <n ; j++) {
	   System.out.println("Enter "+ i +" value");
	    arr[i][j] = sc.nextInt();
	  }
	}
	 
	     ArrayTranspose ad = new ArrayTranspose();
				ad.transpose(arr , m , n) ;
}				
void transpose(int arr[][], int m , int n) {
  int i,j;
  
	for(i = 0 ; i < m ; i ++) {
	  for(j = 0; j <n ; j++) {
	   System.out.println(arr[j][i] + " ");
	  }
	}
 
}
}