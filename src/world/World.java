package world;

import war.ResultOfWar;
import nature.*;

public class World { 

	private static Locations location; 

	public World(){
		setLocation(Locations.SWAMP); 
    }

    public static void setLocation(Locations location){
		World.location = location;
		switch(location){
		case SWAMP:
			Island island = new Island();
            System.out.println("Above the surface of the swamp there was a " + island.toString());
			break;
		case POLICE_STATION:	
            System.out.println("The journey was over and the aborigines were sent to the police station");
            break;
		}
	}
}