import java.util.ArrayList;

public class Team1{

	private static ArrayList<Aborigine> team1 = new ArrayList<Aborigine>();

	public static ArrayList<Aborigine> get(){
		return team1;
	}

	public static void create(Aborigine...ab){ 
		for (Aborigine a: ab){
			team1.add(a);
		}
	}

}