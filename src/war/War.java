package war;
import exception.*;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;

public class War{
	private final TeamOfAborigines teamOfAborigines;
	private final TeamOfPolicemen teamOfPolicemen;
	public War(TeamOfAborigines t1, TeamOfPolicemen t2){
		this.teamOfAborigines = t1;
		this.teamOfPolicemen = t2;
	}
	public TeamOfAborigines getTeamOfAborigines(){
		return teamOfAborigines;
	}
	public TeamOfPolicemen getTeamOfPolicemen(){ return teamOfPolicemen; }
	public void go() {
		class MyThread {
			public void stop() {
				try {
					Thread.sleep(2000);
					System.out.println();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		MyThread mythread = new MyThread();
		if (teamOfAborigines.getTeam().size() != teamOfPolicemen.getTeam().size()) throw new UnequalTeams(String.format("You have created unequal teams. There are %s people in the Aborigines team, %s people in the Policemen team.%n", teamOfAborigines.getTeam().size(), teamOfPolicemen.getTeam().size()));
  	    else for (int i = 0; i < teamOfAborigines.getTeam().size(); i++) {
			  mythread.stop();
			  (teamOfAborigines.getTeam().get(i)).takeWeapon(teamOfAborigines.getTeam().get(i).chooseWeapon());
			  (teamOfPolicemen.getTeam().get(i)).takeWeapon(teamOfPolicemen.getTeam().get(i).chooseWeapon());
			  if (Math.random() <= 0.5) teamOfAborigines.getTeam().get(i).hit(teamOfPolicemen.getTeam().get(i));
			  else teamOfPolicemen.getTeam().get(i).hit(teamOfAborigines.getTeam().get(i));
	    }
		mythread.stop();
    }
}