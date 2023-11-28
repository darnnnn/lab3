package war;
import exception.*;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;
import weapons.Choose;

public class War{
	private final TeamOfAborigines t1;
	private final TeamOfPolicemen t2;
	public War(TeamOfAborigines t1, TeamOfPolicemen t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	public TeamOfAborigines getTeamOfAborigines(){
		return t1;
	}
	public TeamOfPolicemen getTeamOfPolicemen(){ return t2; }
	public void go() throws AmountException{
		if (t1.getTeam().size() != t2.getTeam().size()) throw new AmountException("You have created unequal teams. There are " + t1.getTeam().size() + " people in the Aborigines team, " + t2.getTeam().size() + "  people in the Policemen team.");
  	    else for (int i = 0; i < t1.getTeam().size(); i++) {
			  MyThread.stop();
			  (t1.getTeam().get(i)).takeWeapon(Choose.random());
			  (t2.getTeam().get(i)).takeWeapon(Choose.random());
			  if (Math.random() <= 0.5) t1.getTeam().get(i).hit(t2.getTeam().get(i));
			  else t2.getTeam().get(i).hit(t1.getTeam().get(i));
	    }
		MyThread.stop();
    }
}