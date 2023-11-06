// посмотрите сначала класс Human, потом Aborigine, потом Policeman, потом World
public class Main{
	public static void main(String[] args){
		World world = new World();
        Aborigine a1 = new Aborigine("Alex", 20, "Portugal");
		Aborigine a2 = new Aborigine("Luke", 50, "India");
		Aborigine a3 = new Aborigine("Daniel", 40, "Brazilia");
		Aborigine a4 = new Aborigine("Mike", 80);
		Policeman p1 = new Policeman("Officer Legress", 40);
		Policeman p2 = new Policeman("Officer Joseph Galvez", 75);
		Policeman p3 = new Policeman("Officer Kate", 45, "France");
		Policeman p4 = new Policeman("Officer Hopper", 70);
		world.createTeamOfAborigines(a1, a2, a3, a4);
	    world.createTeamOfPolicemans(p1, p2, p3, p4);
		world.startWar();
	  }
}