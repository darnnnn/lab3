package teams;

import java.util.ArrayList;

public class CheckTwins{
  public boolean checkTwins(Team1 t1, Team2 t2){
    int twins = 0;
  	for(int i=0; i < t1.get().size(); i++){
  	  for(int j=0; j < t2.get().size(); j++){
  	  	if (t1.get().get(i).equals(t2.get().get(j))) twins++;
  	  }
  	}
  	if (twins > 0) return true;
  	else return false;
  }
}