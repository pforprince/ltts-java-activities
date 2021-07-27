/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.activity1;

/**
 *
 * @author Benzee
 */
public class TwoWheeler extends Vehicle {

    public TwoWheeler(boolean kickStartAvailable) {
        this.kickStartAvailable = kickStartAvailable;
    }

    boolean kickStartAvailable;

    public boolean isKickStartAvailable() {
        return kickStartAvailable;
    }

    public void setKickStartAvailable(boolean kickStartAvailable) {
        this.kickStartAvailable = kickStartAvailable;
    }

    public TwoWheeler() {
    }

    void displayDetailInfo() {
        System.out.println("\n---Detail Information---\nKick Start Available: " + kickStartAvailable);
    }
}
