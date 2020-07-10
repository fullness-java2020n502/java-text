package practice22;

public class IllegalInputException extends Exception {

    public IllegalInputException() {
        super();
    }

    public IllegalInputException(String message, Throwable e) {
        super(message, e);
    }

    public IllegalInputException(String message) {
        super(message);
    }

    public IllegalInputException(Throwable e) {
        super(e);
    }
}
