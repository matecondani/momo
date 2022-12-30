package ar.com.momo.monster.mobile.model.exceptions;

/**
 * Class for Internal server exception
 */
public class InternalServerException extends RuntimeException {

    public InternalServerException(String message) {
        super(message);
    }

}
