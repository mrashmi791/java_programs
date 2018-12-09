import java.io.*;

class ArrayException {
    public static void main(String [] ar) {
        int arr[] = new int [5];
        try {
            arr[0] = 22;
            arr[1] = 32;
            arr[2] = 42;
            arr[3] = 52;
            arr[4] = 62;
           // arr[5] = 72;
            for(int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
           // aioobe.printStackTrace();
           System.out.println("maxmium indexis 5");
           System.out.println("indexoverflow");
           
        }
        finally {
            System.out.println("good job");
        }
    }
}