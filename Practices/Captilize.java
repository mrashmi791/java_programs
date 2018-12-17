/*  Java program to captilize the first letter of each word in a sentence
                    My Name Is Rashmi
*/




class Captilize {
    public static void main(String[] ar) {
        String str = "my name is rashmi";
        char ch[] = str.toCharArray();
        for(int i = 0; i < str.length(); i++) {
            if(i == 0 && ch[i] != ' ' ||ch[i] != ' ' && ch[i - 1] == ' ') {
                ch[i] = (char)(ch[i] -'a' + 'A');

            }
        }
        String st = new String(ch);
        System.out.println(st);
    }
}