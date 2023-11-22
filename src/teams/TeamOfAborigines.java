package teams;
import humans.Aborigine;
import interfaces.HaveFun;
public class TeamOfAborigines extends Team<Aborigine> implements HaveFun {
	public TeamOfAborigines(Aborigine...ab){
		super(ab);
	}
    public void haveFun(){ getTeam().forEach(Aborigine::haveFun); }
}