// to reverse string without using API(Predefined methods).



class ReverseString {
    public static void main(String[] ar) {
        String name = "Rashmi";
       
        char str[] = name.toCharArray();
        int length = str.length;

        int left =0; 
        int right = length - 1;

        while(left < right){
            char tmp  = str[left];
            str[left] = str[right];
            str[right] =  tmp;
            left++;
            right--;
        }       

        name = String.valueOf(str);
        //for(int i = 0; i < length; i++) {
            System.out.print(name);
        //}
    }

}


