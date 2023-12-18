package exception;

public class SmallAmount extends RuntimeException{
    public SmallAmount(String message){
        super(message);
    }
}
