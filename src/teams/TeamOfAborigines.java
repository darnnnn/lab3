package teams;
import humans.Aborigine;
import humans.Status;
import interfaces.HaveFun;
import nature.swamp.Island;
import result.GetNames;

public class TeamOfAborigines extends Team<Aborigine> implements HaveFun {
	public TeamOfAborigines(Aborigine...ab) {
		super(ab);
	}
    public void haveFun(Island island){
		GetNames names = new GetNames() {
		};
		System.out.println(String.join(", ", names.get(this, Status.ALIVE)) + " trampled, howled and writhed on " + island + ".");
	}
}