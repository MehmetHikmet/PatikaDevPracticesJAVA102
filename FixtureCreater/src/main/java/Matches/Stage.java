package Matches;

import java.util.HashSet;
import java.util.Set;

public class Stage implements Comparable<Stage>{
    private int round;
    private Set<Matches> matches;

    public Stage(int round, Matches ... matches){
        this.round = round;
        this.matches = new HashSet<>();
        for (Matches m : matches){
            this.matches.add(m);
        }
    }

    @Override
    public String toString(){
        return "Stage " + this.round + "\n" + getMatchesAsString();
    }

    public void addMatch(Matches match){
        matches.add(match);
    }




    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Set<Matches> getMatches() {
        return matches;
    }

    public String getMatchesAsString(){
        String result = "";
        for (Matches m : matches){
            result += m + "\n";
        }
        return result;
    }

    public void setMatches(Set<Matches> matches) {
        this.matches = matches;
    }

    @Override
    public int compareTo(Stage compareTo) {
        return this.round > compareTo.getRound() ? 1 : -1;
    }
}
