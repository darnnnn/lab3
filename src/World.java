import java.util.ArrayList;

public class World { 

	private static Locations location; 
	private static ArrayList<Aborigine> team1 = new ArrayList<Aborigine>(); // массивы для войск аборигенов и полицейских 
	private static ArrayList<Policeman> team2 = new ArrayList<Policeman>();

	public World(){
		setLocation(Locations.ISLAND); // действие в тексте начинается на острове, поэтому при создания мира локация автоматически остров
    }

    public static void setLocation(Locations location){
		World.location = location;
		switch(location){
		case ISLAND:
            System.out.println("Aborigines jumping around the fire");
			break;
		case POLICE_STATION:	
            System.out.println("The journey was over and the aborigines were sent to the police station");
            break;
		}
	}

	public static ArrayList<Aborigine> getTeam1(){
		return team1;
	}
    
    public static ArrayList<Policeman> getTeam2(){
		return team2;
	}

	public void createTeamOfAborigines(Aborigine...ab){ // метод для создания войск аборигенов
		for (Aborigine a: ab){
			team1.add(a);
		}
	}

	public void createTeamOfPolicemans(Policeman...po){ // метод для создания войск полицейских
		for (Policeman p: po){
			team2.add(p);
		}
	}
}