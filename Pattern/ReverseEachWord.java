import java.util.Scanner;

class ReverseEachWord {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();

        String[] words = str.split(" ");
	    String reversedString = "";
	    for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = "";
        for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reversedString + reverseWord + " ";
	}
    System.out.println(str);
	System.out.println(reversedString);
    }
}