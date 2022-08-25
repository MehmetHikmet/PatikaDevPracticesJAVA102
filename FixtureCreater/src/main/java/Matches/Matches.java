package Matches;

import Teams.Teams;

public class Matches {
    private Teams teamOne;
    private Teams teamTwo;

    public Matches(Teams teamOne, Teams teamTwo){
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }


    public Teams getTeamOne() {
        return teamOne;
    }

    public Teams getTeamTwo() {
        return teamTwo;
    }

    @Override
    public String toString() {
        return this.teamOne + " - " + this.teamTwo;
    }
}
