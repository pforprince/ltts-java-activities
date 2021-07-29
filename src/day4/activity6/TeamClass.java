/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Benzee
 */
public class TeamClass implements Comparable<TeamClass> {

    String name;
    List<Player> playerList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public String toString() {
//        return name + ", playerList=" + playerList + '\n';
//    }

    public List<Player> getPlayerList() {
        Collections.sort(playerList);
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public TeamClass(String name) {
        this.name = name;
    }

    void addPlayer(String name) {
        playerList.add(new Player(name));
    }

    @Override
    public int compareTo(TeamClass o) {
        return this.name.compareTo(o.getName());
    }

}
