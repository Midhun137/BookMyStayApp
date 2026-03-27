class InvalidBookingException extends Exception {
    public InvalidBookingException(String msg) { super(msg); }
}

public class UseCase9ErrorHandlingValidation {
    public static void main(String[] args) {

        try {
            throw new InvalidBookingException("Error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}