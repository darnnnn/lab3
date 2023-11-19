package teams;
import java.util.ArrayList;
import java.util.Collections;
import humans.Aborigine;
import interfaces.HaveFun;
public class TeamOfAborigines implements HaveFun {
	private ArrayList<Aborigine> team1 = new ArrayList<Aborigine>();
	public TeamOfAborigines(Aborigine...ab){ Collections.addAll(team1, ab); }
	public ArrayList<Aborigine> get(){
		return team1;
	}
    public void haveFun(){
        team1.forEach(a -> a.haveFun());
    }
  
}