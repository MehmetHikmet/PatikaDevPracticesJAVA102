package Teams;

public class Teams {

    private String teamName;
    private int score;

    public Teams(java.lang.String teamName) {
        this.teamName = teamName;
        this.score = 0;
    }

    public void increaseScore(int score){
        this.score += score;
    }

    public void setName(String newName){
        this.teamName = newName;
    }

    public String getTeamName(){
        return this.teamName;
    }

    public int getScore(){
        return this.score;
    }

    @Override
    public String toString(){
        return this.teamName;
    }
}
