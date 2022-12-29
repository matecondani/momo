package ar.com.momo.monster.mobile.model.exceptions;

/**
 * Class for Not Found Exceptions
 */
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

}
