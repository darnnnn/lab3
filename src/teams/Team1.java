package teams;

import java.util.ArrayList;
import humans.*;

public class Team1 {

  private static int amountOfDeadAborigines; 

  private static int amountOfCaptiveAborigines; 
  
  public int getAmountOfDeadAborigines(){
    return amountOfDeadAborigines;
  }

  public int getAmountOfCaptiveAborigines(){
    return amountOfCaptiveAborigines;
  }

  public void newDeadAborigine(){
    amountOfDeadAborigines++;
  }

  public void newCaptiveAborigine(){
    amountOfCaptiveAborigines++;
  }  

	private static ArrayList<Aborigine> team1 = new ArrayList<Aborigine>();

	public ArrayList<Aborigine> get(){
		return team1;
	}

	public void create(Aborigine...ab){ 
		for (Aborigine a: ab){
			team1.add(a);
    }
	}

}