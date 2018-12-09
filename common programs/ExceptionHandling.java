class SmallAgeExecution extends RuntimeException {

    SmallAgeException() {

    }

    SmallAgeException(String msg) {
      super(msg);  
    }
}

class BigAgeException extends RuntimeException {
    BigAgeException() {

    }

    BigAgeException(String msg) {
        super(msg);

    }
}

class ExceptionHandling {
    public static void main(String [] ar) {
        try {
            int age = Integer.parseInt(ar[0]);
            if (age < 20) {
                throw new SmallAgeException("your age is less than 20");
            }
            else if(age > 30) {
                throw new BigAgeException("your age is more than 30");
            }
            else {
                System.out.println("you are eligible");
            }
        }    
            catch(SmallAgeException sae) {
                sae.printStackTrace();
            }
            catch(BigAgeException bae) {
                bae.printStackTrace();
            }
            System.out.println("thank you");    
        }
    }
