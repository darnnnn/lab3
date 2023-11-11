package teams;

import java.util.ArrayList;
import humans.*;

public class Team2 {

	private static int amountOfDeadPolicemans;

  public int getAmountOfDeadPolicemans(){ 
    return amountOfDeadPolicemans; 
  }
  
  public void newDeadPoliceman(){
    amountOfDeadPolicemans++;
  }

	private static ArrayList<Policeman> team2 = new ArrayList<Policeman>();

	public ArrayList<Policeman> get(){
		return team2;
	}

	public void create(Policeman...po){ 
		for (Policeman p: po){
			team2.add(p);
		}
	}

}