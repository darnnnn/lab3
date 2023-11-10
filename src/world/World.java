package world;

public class World { 

	private Locations location; 

	public World(){
		setLocation(Locations.ISLAND); 
    }

    public void setLocation(Locations location){
		this.location = location;
		switch(location){
		case ISLAND:
            System.out.println("Aborigines jumping around the fire");
			break;
		case POLICE_STATION:	
            System.out.println("The journey was over and the aborigines were sent to the police station");
            break;
		}
	}
}