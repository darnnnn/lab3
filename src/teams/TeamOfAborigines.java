package teams;
import exception.ClonesException;
import exception.FullException;
import humans.Aborigine;
import humans.Status;
import interfaces.HaveFun;
import result.GetNames;

public class TeamOfAborigines extends Team<Aborigine> implements HaveFun {
	public TeamOfAborigines(Aborigine...ab) throws FullException, ClonesException {
		super(ab);
	}
    public void haveFun(){
		GetNames<Team> names = new GetNames<>() {
		};
		System.out.println(String.join(", ", names.get(this, Status.ALIVE)) + " trampled, howled and writhed.");
	}
}