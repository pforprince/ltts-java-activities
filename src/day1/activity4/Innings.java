/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.activity4;

/**
 *
 * @author Benzee
 */
public class Innings {

    private String teamName;
    private String inningsName;
    private int runs;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getInningsName() {
        return inningsName;
    }

    public void setInningsName(String inningsName) {
        this.inningsName = inningsName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Override
    public String toString() {
        if (inningsName.toLowerCase().equals("second")) {
            return "Name:" + teamName + "\n scored: " + runs + "\n " + "Match Ended";
        } else {
            return "Name:" + teamName + "\n scored: " + runs + "\n " + "Need " + (runs + 1) + " to win";
        }

    }

}
