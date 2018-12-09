class AdultAgeException extends Exception {
    AdultAgeException() {
    
    }
    AdultAgeException(String str) {
       super(str);
    }
    }
        
class CustomException2 {
    public static void main(String[] args) {
        int age = Integer.parseInt(a[0]);
        try {
            if(age < 18) {
                throw new AdultAgeException ("u are not adult");
            }
        }    
            else {
                System.out.println("u r adult");
            }

        
        catch(AdultAgeException aae) {
            aae.printStackTrace();
        }
    System.out.println("thanks for searching");
}
}

    