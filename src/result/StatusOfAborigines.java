package result;
import humans.Status;
import teams.TeamOfAborigines;
import java.util.ArrayList;

public interface StatusOfAborigines{
 default ArrayList<String> find(TeamOfAborigines t, Status stat) {
  ArrayList<String> names = new ArrayList<>();
  for(int i=0; i<t.get().size(); i++){
   if (t.get().get(i).getStat() == stat) names.add(t.get().get(i).getName());
  }
  return names;
 }
}
