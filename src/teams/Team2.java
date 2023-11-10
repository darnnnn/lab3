package teams;

import java.util.ArrayList;
import humans.*;

public class Team2{

	private static int amountOfDeadPolicemans;

    public static int getAmountOfDeadPolicemans(){ 
     return amountOfDeadPolicemans; 
    }
  
    public static void newDeadPoliceman(){
      amountOfDeadPolicemans++;
    }

	private static ArrayList<Policeman> team2 = new ArrayList<Policeman>();

	public static ArrayList<Policeman> get(){
		return team2;
	}

	public static void create(Policeman...po){ 
		for (Policeman p: po){
			team2.add(p);
		}
	}

}