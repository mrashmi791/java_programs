class DuplicateArray {
     public static int duplicate(int arr[] , int n) {
        int temp[] = new int[n];
        int j = 0;
        int index = 0;
        for(int i = 0; i< n-1;i++) {
            if(arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
                 index++;
            }
        }
        temp [j++] = arr[n-1];
        for(int i = 0; i <j ; i++) {
            arr[i] = temp[i];
            
        }
       
        return j;
    }
    public static void main(String[] ar) {
        int arr[] = {12,45,45,78,78,33,33,56};
        int length = arr.length;
        length = duplicate(arr,length);
        for(int i =0; i<length;i++) {
            System.out.print(arr[i] + " ");
        }
       
    }
}