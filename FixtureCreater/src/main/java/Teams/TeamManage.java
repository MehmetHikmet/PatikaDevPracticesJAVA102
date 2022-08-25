package Teams;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TeamManage {

    Set<Teams> teams;

    public TeamManage(){

        teams = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teams");
        String line = "";

        while (true){
            System.out.print("- ");
            line = scanner.nextLine();
            if (line.equals(".")){
                break;
            }
            teams.add(new Teams(line));
        }
    }

    public Set<Teams> getTeams(){
        return this.teams;
    }


    public Teams getRandomTeam(){
        if (this.teams.size() == 0){
            return null;
        }
        int randomTeam = (int)(Math.random() * (this.teams.size() - 1));
        return (Teams) this.teams.toArray()[randomTeam];
    }

    public Teams getRandomTeam(Set<Teams> teams){
        if (teams.size() == 0){
            return null;
        }
        int randomTeam = (int)(Math.random() * (teams.size() - 1));
        return (Teams) teams.toArray()[randomTeam];
    }


    public int getSize(){
        return this.teams.size();
    }

    public void addTeam(Teams team){
        this.teams.add(team);
    }

    public void printTeams(Set<Teams> teams){
        for (Teams t : teams){
            System.out.println(t);
        }
    }
    public void printTeams(){
        for (Teams t : this.teams){
            System.out.println(t);
        }
    }
}
