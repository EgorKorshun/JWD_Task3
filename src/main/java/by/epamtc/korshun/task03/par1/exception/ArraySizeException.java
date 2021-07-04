package by.epamtc.korshun.task03.par1.exception;
public class ArraySizeException extends Exception {
    public ArraySizeException() {
        super();
    }

    public ArraySizeException(String message) {
        super(message);
    }

    public ArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArraySizeException(Throwable cause) {
        super(cause);
    }
}
