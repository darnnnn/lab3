import exception.AmountException;
import exception.ClonesException;
import exception.DeadException;
import humans.Aborigine;
import humans.Policeman;
import interactionWithPoliceman.Emotions;
import interactionWithPoliceman.Figurine;
import interactionWithPoliceman.Hallucinations;
import interactionWithPoliceman.Sound;
import nature.Bodies;
import nature.Bonfire;
import nature.Gallows;
import nature.Monolith;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;
import war.War;
import world.Locations;
import world.World;
import result.Result;
public class Main{
	public static void main(String[] args){
		World world = new World(Locations.SWAMP);
        Aborigine a1 = new Aborigine("Alex", 40, "Portugal");
		Aborigine a2 = new Aborigine("Luke", 50, "India");
		Aborigine a3 = new Aborigine("Daniel", 40, "Brazil");
		Aborigine a4 = new Aborigine("Mike", 80);
		TeamOfAborigines team1 = new TeamOfAborigines(a1, a2, a3, a4);
		Bonfire bonfire = new Bonfire();
		bonfire.burn(team1);
		Monolith monolith = new Monolith("granite", 8);
		Figurine figurine = new Figurine("on the top of monolith");
		Gallows gallows = new Gallows(10);
		Bodies bodies = new Bodies();
		bodies.hangDown(gallows);
		Policeman p1 = new Policeman("Officer Legress", 20);
		Policeman p2 = new Policeman("Officer Joseph Galvez", 75);
		Policeman p3 = new Policeman("Officer Kate", 45, "France");
		Policeman p4 = new Policeman("Officer Hopper", 70 );
		TeamOfPolicemen team2 = new TeamOfPolicemen(p1, p2, p3, p4);
	    Sound sound = new Sound("forest");
        p2.hear(sound);
        Hallucinations hallucinations = new Hallucinations("weak beating of large wings, and also the reflection of sparkling eyes and the outline of a huge white mass behind the very distant trees");
        p2.see(hallucinations);
        team2.feel(Emotions.STUPOR);
        team2.feel(Emotions.COURAGE);
	    War war = new War(team1, team2);
	    try{
	      war.go();
	      world.setLocation(Locations.POLICE_STATION);
		  Result result = new Result();
		  result.show(war);
          p1.take(figurine);
	    } catch (AmountException | ClonesException | DeadException err) {
          System.out.println(err.getMessage());
	    }
    }
}