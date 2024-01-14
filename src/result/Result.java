package result;
import humans.Status;
import teams.Team;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;
import war.War;

public class Result implements GetNames {
    GetNames names = new GetNames() {
    };
    DisplayNames <TeamOfAborigines> namesOfAborigines = (team) ->
        String.format("Names of alive aborigines: %s%nNames of dead aborigines: %s%nNames of captivity aborigines: %s", names.get(team, Status.ALIVE), names.get(team, Status.DEAD), names.get(team, Status.IN_CAPTIVITY));
    DisplayNames <TeamOfPolicemen> namesOfPolicemen = (team) ->
       String.format("Names of alive policemen: %s%nNames of dead policemen: %s%n", names.get(team, Status.ALIVE), names.get(team, Status.DEAD));

    public void show(War war){
        System.out.println(namesOfAborigines.display(war.getTeamOfAborigines()));
        System.out.println(namesOfPolicemen.display(war.getTeamOfPolicemen()));
    }
}

interface DisplayNames<T extends Team>{
    String display(T team);
}


