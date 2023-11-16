import world.World;
import world.Locations;
import humans.Aborigine;
import humans.Policeman;
import teams.Team1;
import teams.Team2;
import war.War;
import nature.Bonfire;
import things.*;
import java.util.ArrayList;
import humans.Emotions;
import exception.*;
import war.ResultOfWar;

public class Main{
	public static void main(String[] args){
		World world = new World();
        Aborigine a1 = new Aborigine("Alex", 20, "Portugal");
		Aborigine a2 = new Aborigine("Luke", 50, "India");
		Aborigine a3 = new Aborigine("Daniel", 40, "Brazilia");
		Aborigine a4 = new Aborigine("Mike", 80);
		Team1 team1 = new Team1();
		team1.create(a1, a2, a3, a4);
		Bonfire bonfire = new Bonfire();
		bonfire.burn();
		Monolith monolith = new Monolith();
		monolith.riseUp();
		Figurine figurine = new Figurine();
		figurine.rest(monolith);
		Gallows gallows = new Gallows();
		gallows.locate();
		Bodies bodies = new Bodies();
		bodies.hangDown(gallows);
		Policeman p1 = new Policeman("Officer Legress", 40);
		Policeman p2 = new Policeman("Officer Joseph Galvez", 75);
		Policeman p3 = new Policeman("Officer Kate", 45, "France");
		Policeman p4 = new Policeman("Officer Hopper", 70);
		Team2 team2 = new Team2();
	    team2.create(p1, p2, p3, p4);
	    Sound sound = new Sound();
        p2.hear(sound);
        Hallucinations hallucinations = new Hallucinations();
        p2.see(hallucinations);
        team2.get().forEach(p -> p.feel(Emotions.STUPOR));
        team2.get().forEach(p -> p.feel(Emotions.COURAGE));
	    War war = new War();
	    try{
	      war.go();
	      world.setLocation(Locations.POLICE_STATION);
	      ResultOfWar r = new ResultOfWar();
	      r.result();
	    } catch (AmountException err) {
          System.out.println(err.getMessage());
	    } catch (TwinsException err) {
	      System.out.println(err.getMessage());
	    }
	  }
}