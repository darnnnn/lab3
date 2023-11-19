package result;
import humans.Status;
import war.War;

public class Result implements StatusOfPolicemen, StatusOfAborigines{
    public void show(War war){
        StatusOfAborigines status1 = new StatusOfAborigines() {
        };
        StatusOfPolicemen status2 = new StatusOfPolicemen() {
        };
        Lambda sum = (a,b) -> a+b;
        Lambda diff = (a,b) -> a-b;
        System.out.println("Names of alive aborigines: " +  String.join(", ", status1.find(war.getTeamA(), Status.ALIVE)));
        System.out.println("Names of alive policemen: " + String.join(", ", status2.find(war.getTeamP(), Status.ALIVE)));
        int sumAlive = sum.count( status1.find(war.getTeamA(), Status.ALIVE).size(), status2.find(war.getTeamP(), Status.ALIVE).size() );
        System.out.println("Total survivors: " + sumAlive);
        System.out.println("Names of dead aborigines: " + String.join(", ", status1.find(war.getTeamA(), Status.DEAD)));
        System.out.println("Names of dead policemen: " + String.join(", ", status2.find(war.getTeamP(), Status.DEAD)));
        int sumDead = sum.count( status1.find(war.getTeamA(), Status.DEAD).size(), status2.find(war.getTeamP(), Status.DEAD).size() );
        System.out.println("Total deaths: " + sumDead);
        int diffAll = diff.count(sumAlive, sumDead);
        if (diffAll > 0) System.out.println("Many people survived");
        if (diffAll == 0) System.out.println("Equal numbers of dead and living");
        else System.out.println("Too many deaths");
    }
}
interface Lambda{
    int count(int a, int b);
}

