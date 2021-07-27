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
public class FourWheeler extends Vehicle {

    private String audioSystem;
    int numberOfDoors;

    public FourWheeler() {
    }

    public FourWheeler(String audioSystem, int numberOfDoors) {
        this.audioSystem = audioSystem;
        this.numberOfDoors = numberOfDoors;
    }

    public String getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    void displayDetailInfo() {
        System.out.println("\n---Detail Information---\nAudioSystem: " + audioSystem + "\nNo of doors: " + numberOfDoors);
    }
    
}
