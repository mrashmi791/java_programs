 /*package whatever //do not write package name here */

import java.io.*;

import java.util.*;

class CountString {
    public static void main(String[] args) {
        String str ;
        int word = 0;
        int space = 0;
        int number = 0; 
        int other = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter String");
        str = sc.nextLine();
        
        for(int i = 0; i <str.length(); i++) {
            int t = str.charAt(i);
            if(t >= 65 && t <= 90 || t >= 97 && t <= 122 ) {
            word++;
        }
        if(t >= 48 && t <= 57) {
            number++;

        }
         if(t.equals(32)) {
            space++;
        }
        else {
            other++;
        }
    
    System.out.println(word);
    System.out.println(number);
    System.out.println(space);
    System.out.println(other);
    }
    }
}