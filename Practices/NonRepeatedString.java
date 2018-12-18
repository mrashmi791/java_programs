import java.util.Scanner;

class NonRepeatedString {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch[] = str.toCharArray();
        boolean flag = false;

        for(int i = 0; i < ch.length; i++) {
            flag = false;
            for(int j = 0; j < ch.length; j++) {
                if(ch[i] == ch[j] && i != j) {
                     flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(i);
                break;
            }
        } 
    }
}