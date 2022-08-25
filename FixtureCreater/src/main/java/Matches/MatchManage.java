package Matches;

import Teams.TeamManage;
import Teams.Teams;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MatchManage {

    private TeamManage teams;
    private Set<Stage> rounds;
    public MatchManage(TeamManage teams){
        this.teams = teams;
        this.rounds = new TreeSet<>();
        if (teams.getSize() % 2 != 0){
            teams.addTeam(new Teams("Bay"));
        }
    }


    public void calculateAllRounds(){

        int matchamount = 0;
        for (int i = teams.getSize() - 1; i >= 1; i--){
            matchamount += i;
        }
        matchamount *= 2;

        int roundAmount = matchamount / (teams.getSize()/2);

        for (int i = 1; i <= roundAmount; i++){
            calculateRound(i);
        }
    }

    public void printAllRounds(){
        calculateAllRounds();
        System.out.println("All matches are done");
        for (Stage r : rounds){
            System.out.println(r);
        }
    }

    public Stage calculateRound(int round){
        Stage currentRound = new Stage(round);
        Set<Teams> tempTeams = new HashSet<>();
        tempTeams.addAll(teams.getTeams());

        Set<Matches> allMatches = getAllMatches();

        while (!tempTeams.isEmpty()){
            Teams t1 = teams.getRandomTeam(tempTeams);
            tempTeams.remove(t1);
            Teams t2;
            do{
                t2 = teams.getRandomTeam(tempTeams);
            } while (allMatches.contains(t2));
            tempTeams.remove(t2);
            currentRound.addMatch(new Matches(t1, t2));
        }
        rounds.add(currentRound);
        return currentRound;
    }

    public Set<Matches> getAllMatches(){
        Set<Matches> result = new HashSet<>();
        for (Stage r : rounds){
            result.addAll(r.getMatches());
        }
        return result;
    }


    public TeamManage getTeams() {
        return teams;
    }
}
