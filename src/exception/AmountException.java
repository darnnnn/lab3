package exception;

public class AmountException extends RuntimeException{
  public AmountException(String message){
    super(message);
  }
}