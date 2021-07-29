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
public class Player implements Comparable<Player> {

    private String name;

    @Override
    public String toString() {
        return  "--" + name;
    }

    public Player(String name) {
        this.name = name;
    }

    public Player() {
    }

    @Override
    public int compareTo(Player player) {
        return this.name.compareTo(player.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
