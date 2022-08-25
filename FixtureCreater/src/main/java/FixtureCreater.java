import Matches.MatchManage;
import Teams.TeamManage;

public class FixtureCreater {

    public static void main(String[] args){
        TeamManage teamManager = new TeamManage();
        MatchManage matchManager = new MatchManage(teamManager);
        matchManager.printAllRounds();
    }
}
