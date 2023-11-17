package world;
import nature.Island;
public class World{
	private Locations location;
	public World(Locations location){
		setLocation(location);
    }
	public void setLocation(Locations location){
		this.location = location;
		switch(location){
			case SWAMP:
				Island island = new Island("grassy, dry", 1, 0);
				System.out.println("Above the surface of the swamp there was a " + island.describe());
				break;
			case POLICE_STATION:
				System.out.println("The journey was over and the aborigines were sent to the police station");
				break;
		}
	}
}