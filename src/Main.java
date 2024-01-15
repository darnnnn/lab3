import exception.DeadException;
import humans.Aborigine;
import humans.Policeman;
import humans.Squatter;
import interactionWithHuman.Emotions;
import interactionWithHuman.Figurine;
import interactionWithHuman.Hallucinations;
import interactionWithHuman.Sound;
import nature.forest.Forest;
import nature.swamp.*;
import nature.village.Huts;
import nature.village.Inhabitants;
import nature.village.Wind;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;
import transport.Car;
import transport.Transport;
import transport.Waggon;
import war.War;
import world.Locations;
import world.World;
import result.Result;
public class Main{
	public static void main(String[] args) {
		World world = new World();
		world.setLocation(Locations.NEW_ORLEANS);
		world.describe();
		Policeman p1 = new Policeman("Legress", 50);
		Policeman p2 = new Policeman("Joseph Galvez", 0, "Spain");
		Policeman p3 = new Policeman("Kate", 45, "France");
		Policeman p4 = new Policeman("Hopper", 70 );
		Policeman p5 = new Policeman("Jake", 60);
		Policeman p6 = new Policeman("Mike", 38, "USA");
		Policeman p7 = new Policeman("Thomas", 80, "UK");
		TeamOfPolicemen teamOfPolicemen = new TeamOfPolicemen(p1, p2, p3, p4, p5, p6, p7);
		world.addHuman(p1, p2, p3, p4, p5, p6, p7);
		Squatter s1 = new Squatter("Scott");
		world.addHuman(s1);
		s1.feel(Emotions.FEAR);

		Car car = new Car();
		Waggon waggon1 = new Waggon();
		Waggon waggon2 = new Waggon();
		Transport[] transport = {car, waggon1, waggon2};
		teamOfPolicemen.getIntoTpansport(transport);
		s1.getIntoTpansport(transport);
		for(Transport tr:transport){tr.go(Locations.ROAD);}
		world.setLocation(Locations.ROAD);
		world.describe();

		for(Transport tr:transport){tr.arrive(Locations.FOREST);}
		world.setLocation(Locations.FOREST);
		world.describe();
		Forest forest = new Forest();
		Forest.Roots roots = forest.new Roots("Terrible");
		Forest.Lichen lichen = forest.new Lichen("spanish");
		roots.surround(teamOfPolicemen, s1);
		lichen.surround(teamOfPolicemen, s1);
		Forest.Stones stones = forest.new Stones("wet");
		Forest.Wall wall = forest.new Wall("rotten");
		stones.appear(teamOfPolicemen, s1);
		wall.appear(teamOfPolicemen, s1);

		world.setLocation(Locations.VILLAGE);
		world.describe();
		Huts huts = new Huts(18);
		Huts.Door door = huts.new Door();
		Inhabitants inhabitants = new Inhabitants();
		inhabitants.openDoor(door);
		Sound sound1 = new Sound("from tomtam");
		teamOfPolicemen.hear(sound1);
		Wind wind = new Wind();
		teamOfPolicemen.hear(wind.bring());
		inhabitants.say("We won't go with you!");
		world.deleteHuman(s1);

		p1.goWithTeam(teamOfPolicemen, Locations.UNKNOWN_AREA);
		world.setLocation(Locations.UNKNOWN_AREA);
		world.describe();

		world.setLocation(Locations.SWAMP);
		world.describe();
		p2.stagger();
		p3.stagger();
		p4.faint();
		p6.hear(p5.scream());
		p1.splashWater(p4);

        Aborigine a1 = new Aborigine("Alex", 40, "Portugal");
		Aborigine a2 = new Aborigine("Luke", 50, "India");
		Aborigine a3 = new Aborigine("Daniel", 40, "Brazil");
		Aborigine a4 = new Aborigine("Mike", 20);
		Aborigine a5 = new Aborigine("Simon", 60);
		Aborigine a6 = new Aborigine("Jacob", 70, "Morocco");
		Aborigine a7 = new Aborigine("Nicholas", 40, "Brazil");
		TeamOfAborigines teamOfAborigines = new TeamOfAborigines(a1, a2, a3, a4, a5, a6, a7);
		world.addHuman(a1, a2, a3, a4, a5, a6, a7);
		Island island = new Island("grassy, dry", 1, 0);
		teamOfAborigines.haveFun(island);
		Bonfire bonfire = new Bonfire();
		bonfire.burn();
		teamOfAborigines.haveFun(bonfire);
		Monolith monolith = new Monolith("granite", 8);
		monolith.riseUp();
		Figurine figurine = new Figurine();
		figurine.setPlace("on the top of monolith");
		Gallows gallows = new Gallows(10);
		Gallows.Bodies bodies = gallows.new Bodies();
		bodies.hangDown();
	    Sound sound2 = new Sound("from forest");
        p2.hear(sound2);
        Hallucinations hallucinations = new Hallucinations("weak beating of large wings, and also the reflection of sparkling eyes and the outline of a huge white mass behind the very distant trees");
        p2.see(hallucinations);
        teamOfPolicemen.feel(Emotions.STUPOR);
        teamOfPolicemen.feel(Emotions.COURAGE);
	    War war = new War(teamOfAborigines, teamOfPolicemen);
		war.go();

		world.setLocation(Locations.POLICE_STATION);
		world.describe();
		Result result = new Result();
		result.show(war);
		p2.takeFigurine(figurine);
    }
}