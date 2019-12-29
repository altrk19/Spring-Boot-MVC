package guru.springframework.exceptions;

public class CustomResourceNotFoundException extends RuntimeException{
    public CustomResourceNotFoundException() {
    }

    public CustomResourceNotFoundException(String message) {
        super(message);
    }

    public CustomResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomResourceNotFoundException(Throwable cause) {
        super(cause);
    }

    public CustomResourceNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
