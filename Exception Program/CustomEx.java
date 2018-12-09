class AdultAgeException extends Exception {
    AdultAgeException() {

    }
    AdultAgeException(String str) {
        super(str);
    }
}
class CustomEx {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        try {
            if (age < 18) {
                throw new AdultAgeException("u are not adult");
            }
            else {
                System.out.println("u r adult");
            }
        } catch (AdultAgeException aae) {
            aae.printStackTrace();
        }
        System.out.println("thanks for searching");
    }
}
