package world;
import humans.Human;
import nature.Island;
import teams.Team;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;
import java.util.ArrayList;

public class World{
    private TeamOfAborigines t1;
    private TeamOfPolicemen t2;
    private ArrayList<Human> humans = new ArrayList<>();
	private Locations location;
    public <T extends Team> void addTeam(T t){
        if (t instanceof TeamOfAborigines) {
            this.t1 = (TeamOfAborigines) t;
            t1.getTeam().forEach(h->h.setLocation(location));
        }
        if (t instanceof TeamOfPolicemen) {
            this.t2 = (TeamOfPolicemen) t;
            t2.getTeam().forEach(h->h.setLocation(location));
        }
    }
    public void addHuman(Human h){
        humans.add(h);
        h.setLocation(location);
    }
    public void deleteHuman(Human h){
        humans.remove(h);
    }
	public void setLocation(Locations location){
		this.location = location;
        if (t1 != null) t1.getTeam().forEach(h->h.setLocation(location));
        if (t2 != null) t2.getTeam().forEach(h->h.setLocation(location));
        if (humans != null) humans.forEach(h->h.setLocation(location));
        switch (location) {
            case NEW_ORLEANS -> System.out.println("On November 1, 1907, the New Orleans police received desperate reports from the southern areas, swamps and lagoons.");
            case ROAD -> System.out.println("So, " + t2.getTeam().size() + " policemen, stationed on two carts and a car, went to the scene of the incident, taking with them a trembling squatter as a guide.");
            case FOREST -> System.out.println("When the passing road ended, everyone got out of the carts and cars and splashed through the mud for several miles in complete silence through the gloomy cypress forest, under the covers of which daylight never penetrated.");
            case SWAMP -> {
                Island island = new Island("grassy, dry", 1, 0);
                System.out.println("Above the surface of the swamp there was a " + island.describe());
            }
            case POLICE_STATION -> System.out.println("The journey was over and the aborigines were sent to the police station");
        }
	}
}