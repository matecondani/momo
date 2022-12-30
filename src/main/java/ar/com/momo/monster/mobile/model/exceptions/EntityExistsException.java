package ar.com.momo.monster.mobile.model.exceptions;

/**
 * Exception class to be used when an entity has already been created
 */
public class EntityExistsException extends RuntimeException {

    public EntityExistsException(String message) {
        super(message);
    }

}
