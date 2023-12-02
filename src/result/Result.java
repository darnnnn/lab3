package result;
import humans.Status;
import teams.Team;
import teams.TeamOfAborigines;
import war.War;

public class  Result implements GetNames {
    GetNames names1 = new GetNames() {
    };
    DisplayNames names2 = (t, s) ->{
        if (t instanceof TeamOfAborigines) {
            if (s == Status.ALIVE) return "Names of alive aborigines: " +  String.join(", ", names1.get(t, s));
            if (s == Status.DEAD) return "Names of dead aborigines: " + String.join(", ", names1.get(t, s));
            else return "Names of captivity aborigines: " + String.join(", ", names1.get(t, s));
        } else {
            if (s == Status.ALIVE) return "Names of alive policemen: " + String.join(", ", names1.get(t, s));
            else return "Names of dead policemen: " + String.join(", ", names1.get(t, s));
        }
    };
    Function sum = (a,b) -> a+b;
    Function diff = (a,b) -> a-b;
    public void show(War war){
        System.out.println(names2.display(war.getTeamOfAborigines(), Status.ALIVE));
        System.out.println(names2.display(war.getTeamOfPolicemen(), Status.ALIVE));
        int sumAlive = sum.count( names1.get(war.getTeamOfAborigines(), Status.ALIVE).size(), names1.get(war.getTeamOfPolicemen(), Status.ALIVE).size() );
        System.out.println("Total survivors: " + sumAlive);
        System.out.println(names2.display(war.getTeamOfAborigines(), Status.IN_CAPTIVITY));
        System.out.println(names2.display(war.getTeamOfAborigines(), Status.DEAD));
        System.out.println(names2.display(war.getTeamOfPolicemen(), Status.DEAD));
        int sumDead = sum.count( names1.get(war.getTeamOfAborigines(), Status.DEAD).size(), names1.get(war.getTeamOfPolicemen(), Status.DEAD).size() );
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

interface DisplayNames{
    String display(Team t, Status s);
}


