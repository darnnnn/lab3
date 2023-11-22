package result;
import humans.Status;
import teams.Team;
import teams.TeamOfAborigines;
import war.War;

public class  Result implements FindStatus<Team>{
    FindStatus<Team> status = new FindStatus<Team>() {
    };
    GetNames<Team> names = (t, s) ->{
        if (t instanceof TeamOfAborigines) {
            if (s == Status.ALIVE) return "Names of alive aborigines: " +  String.join(", ", status.find(t, s));
            if (s == Status.DEAD) return "Names of dead aborigines: " + String.join(", ", status.find(t, s));
            else return "Names of captivity aborigines: " + String.join(", ", status.find(t, s));
        } else {
            if (s == Status.ALIVE) return "Names of alive policemen: " + String.join(", ", status.find(t, s));
            else return "Names of dead policemen: " + String.join(", ", status.find(t, s));
        }
    };
    Function sum = (a,b) -> a+b;
    Function diff = (a,b) -> a-b;
    public void show(War war){
        System.out.println(names.get(war.getTeamOfAborigines(), Status.ALIVE));
        System.out.println(names.get(war.getTeamOfPolicemen(), Status.ALIVE));
        int sumAlive = sum.count( status.find(war.getTeamOfAborigines(), Status.ALIVE).size(), status.find(war.getTeamOfPolicemen(), Status.ALIVE).size() );
        System.out.println("Total survivors: " + sumAlive);
        System.out.println(names.get(war.getTeamOfAborigines(), Status.IN_CAPTIVITY));
        System.out.println(names.get(war.getTeamOfAborigines(), Status.DEAD));
        System.out.println(names.get(war.getTeamOfPolicemen(), Status.DEAD));
        int sumDead = sum.count( status.find(war.getTeamOfAborigines(), Status.DEAD).size(), status.find(war.getTeamOfPolicemen(), Status.DEAD).size() );
        System.out.println("Total deaths: " + sumDead);
        int diffAll = diff.count(sumAlive, sumDead);
        if (diffAll > 0) System.out.println("Many people survived");
        if (diffAll == 0) System.out.println("Equal numbers of dead and living");
        if (diffAll < 0) System.out.println("Too many deaths");
    }
}
interface Function{
    int count(int a, int b);
}

interface GetNames<T extends Team>{
    String get(T t, Status s);
}


