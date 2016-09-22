package framework.ftc.cobaltforge.exceptions;

/**
 * thrown when directives are added after init
 * Created by Dummyc0m on 9/22/16.
 */
public final class IllegalModificationException extends RuntimeException {
    public IllegalModificationException(String message) {
        super(message);
    }
}
