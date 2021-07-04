package by.epamtc.korshun.task03.par1.exception;
public class NullFileException extends Exception{
    public NullFileException() {
        super();
    }

    public NullFileException(String message) {
        super(message);
    }

    public NullFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullFileException(Throwable cause) {
        super(cause);
    }
}
