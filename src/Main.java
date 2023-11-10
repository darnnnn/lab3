import world.*;
import humans.*;
import teams.*;
import war.*;

public class Main{
	public static void main(String[] args){
		World world = new World();
        humans.Aborigine a1 = new humans.Aborigine("Alex", 20, "Portugal");
		humans.Aborigine a2 = new humans.Aborigine("Luke", 50, "India");
		humans.Aborigine a3 = new humans.Aborigine("Daniel", 40, "Brazilia");
		humans.Aborigine a4 = new humans.Aborigine("Mike", 80);
		humans.Policeman p1 = new humans.Policeman("Officer Legress", 40);
		humans.Policeman p2 = new humans.Policeman("Officer Joseph Galvez", 75);
		humans.Policeman p3 = new humans.Policeman("Officer Kate", 45, "France");
		humans.Policeman p4 = new humans.Policeman("Officer Hopper", 70);
		teams.Team1 team1 = new teams.Team1();
		teams.Team2 team2 = new teams.Team2();
		team1.create(a1, a2, a3, a4);
	    team2.create(p1, p2, p3, p4);
	    war.War w = new war.War();
	    w.go();
	  }
}