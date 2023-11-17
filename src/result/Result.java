package result;
import humans.Status;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemans;

public class Result implements StatusOfPolicemans, StatusOfAborigines{
    public static void show(){
        StatusOfAborigines status1 = new StatusOfAborigines() {
        };
        StatusOfPolicemans status2 = new StatusOfPolicemans() {
        };
        TeamOfAborigines t1 = new TeamOfAborigines();
        TeamOfPolicemans t2 = new TeamOfPolicemans();
        System.out.println("Names of alive aborigines: " +  String.join(", ", status1.find(t1, Status.ALIVE)));
        System.out.println("Names of aborigines in captivity: " +String.join(", ", status1.find(t1, Status.IN_CAPTIVITY)));
        System.out.println("Names of dead aborigines: " +String.join(", ", status1.find(t1, Status.DEAD)));
        System.out.println("Names of alive policemans: " +String.join(", ", status2.find(t2, Status.ALIVE)));
        System.out.println("Names of dead policemans: " +String.join(", ", status2.find(t2, Status.DEAD)));
    }
}
