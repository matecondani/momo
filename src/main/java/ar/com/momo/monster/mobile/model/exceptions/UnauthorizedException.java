package ar.com.momo.monster.mobile.model.exceptions;

/**
 * Class for Unauthorized Exceptions
 */
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String message) {
        super(message);
    }
}
