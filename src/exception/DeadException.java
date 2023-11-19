package exception;
import java.util.NoSuchElementException;

public class DeadException extends NoSuchElementException{
    public DeadException(String message){
        super(message);
    }
}
