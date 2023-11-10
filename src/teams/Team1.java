package teams;

import java.util.ArrayList;
import humans.*;

public class Team1{

  private static int amountOfDeadAborigines; 

  private static int amountOfCaptiveAborigines; 
  
  public static int getAmountOfDeadAborigines(){
    return amountOfDeadAborigines;
  }

  public static int getAmountOfCaptiveAborigines(){
    return amountOfCaptiveAborigines;
  }

  public static void newDeadAborigine(){
    amountOfDeadAborigines++;
  }

  public static void newCaptiveAborigine(){
    amountOfCaptiveAborigines++;
  }  

	private static ArrayList<Aborigine> team1 = new ArrayList<Aborigine>();

	public static ArrayList<Aborigine> get(){
		return team1;
	}

	public static void create(Aborigine...ab){ 
		for (Aborigine a: ab){
			team1.add(a);
    }
	}

}