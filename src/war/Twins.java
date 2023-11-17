package war;
import teams.*;
public class Twins{
  public static boolean check(TeamOfAborigines t1, TeamOfPolicemans t2){
    int twins = 0;
  	for(int i=0; i < t1.get().size(); i++){
  	  for(int j=0; j < t2.get().size(); j++){
  	  	if (t1.get().get(i).equals(t2.get().get(j))) twins++;
  	  }
  	}
	  return twins > 0;
  }
}