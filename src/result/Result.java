package result;
import humans.Status;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;
import war.War;

public class Result implements StatusOfPolicemen, StatusOfAborigines{
    public void show(War war){
        StatusOfAborigines status1 = new StatusOfAborigines() {
        };
        StatusOfPolicemen status2 = new StatusOfPolicemen() {
        };
        NamesOfAborigines names1 = (t, s) -> {
            if (s == Status.ALIVE) return "Names of alive aborigines: " +  String.join(", ", status1.find(t, s));
            if (s == Status.DEAD) return "Names of dead aborigines: " + String.join(", ", status1.find(t, s));
            else return "Names of captivity aborigines: " + String.join(", ", status1.find(t, s));
        };
        NamesOfPolicemen names2 = (t, s) -> {
            if (s == Status.ALIVE) return "Names of alive policemen: " + String.join(", ", status2.find(t, s));
            else return "Names of dead policemen: " + String.join(", ", status2.find(t, s));
        };
        Lambda sum = (a,b) -> a+b;
        Lambda diff = (a,b) -> a-b;
        System.out.println(names1.get(war.getTeamOfAborigines(), Status.ALIVE));
        System.out.println(names2.get(war.getTeamOfPolicemen(), Status.ALIVE));
        int sumAlive = sum.count( status1.find(war.getTeamOfAborigines(), Status.ALIVE).size(), status2.find(war.getTeamOfPolicemen(), Status.ALIVE).size() );
        System.out.println("Total survivors: " + sumAlive);
        System.out.println(names1.get(war.getTeamOfAborigines(), Status.IN_CAPTIVITY));
        System.out.println(names1.get(war.getTeamOfAborigines(), Status.DEAD));
        System.out.println(names2.get(war.getTeamOfPolicemen(), Status.DEAD));
        int sumDead = sum.count( status1.find(war.getTeamOfAborigines(), Status.DEAD).size(), status2.find(war.getTeamOfPolicemen(), Status.DEAD).size() );
        System.out.println("Total deaths: " + sumDead);
        int diffAll = diff.count(sumAlive, sumDead);
        if (diffAll > 0) System.out.println("Many people survived");
        if (diffAll == 0) System.out.println("Equal numbers of dead and living");
        if (diffAll < 0) System.out.println("Too many deaths");
    }
}
interface Lambda{
    int count(int a, int b);
}

interface NamesOfAborigines{
    String get(TeamOfAborigines t, Status s);
}

interface NamesOfPolicemen{
    String get(TeamOfPolicemen t, Status s);
}

