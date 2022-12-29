package ar.com.momo.monster.mobile.model.exceptions;

/**
 * Class for Bad Request Exceptions
 */
public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }

}
