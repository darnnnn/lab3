package exception;

public class UnequalTeams extends RuntimeException{
  public UnequalTeams(String message){
    super(message);
  }
}