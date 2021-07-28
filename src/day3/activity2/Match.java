/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity2;

/**
 *
 * @author Benzee
 */
abstract class Match {

    private int currentscore;
    private float currentover;
    private int target;

    void setValue(int score, float over, int target) {
        this.currentover = over;
        this.currentscore = score;
        this.target = target;
    }

    int getScore() {
        return currentscore;
    }

    float getOver() {
        return currentover;
    }

    int getTarget() {
        return target;
    }

    abstract float calculateRunRate();

    abstract int calculateBalls();

    abstract void display(double reqRunRate, int balls);
}
