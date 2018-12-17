/* To reverse the word
            name
            eman

*/

import java.util.Scanner;

class ReverseWord {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int length = ch.length;
        int left = 0;
        int right = length - 1;

        while(left < right) {
            char tmp  = ch[left];
            ch[left] = ch[right];
            ch[right] =  tmp;
            left++;
            right--;
        }
        s = String.valueOf(ch);
        System.out.print(s);
    }
}