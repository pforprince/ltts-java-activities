/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity2;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class MatchMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the match format\n1. ODI\n2. T20\n3. Test");
        int format = s.nextInt();
        if (format == 1) {
            System.out.println("Enter the Current score:");
            int score = s.nextInt();
            System.out.println("Enter the Current over:");
            float over = s.nextFloat();
            System.out.println("Enter the Target score:");
            int target = s.nextInt();
            ODIMatch o = new ODIMatch();
            o.setValue(score, over, target);
            double reqRunRate = o.calculateRunRate();

            int balls = o.calculateBalls();
            o.display(reqRunRate, balls);
        } else if (format == 2) {
            System.out.println("Enter the Current score:");
            int score = s.nextInt();
            System.out.println("Enter the Current over:");
            float over = s.nextFloat();
            System.out.println("Enter the Target score:");
            int target = s.nextInt();
            T20Match o = new T20Match();
            o.setValue(score, over, target);
            double reqRunRate = o.calculateRunRate();

            int balls = o.calculateBalls();
            o.display(reqRunRate, balls);
        } else if (format == 3) {
            System.out.println("Enter the Current score:");
            int score = s.nextInt();
            System.out.println("Enter the Current over:");
            float over = s.nextFloat();
            System.out.println("Enter the Target score:");
            int target = s.nextInt();
            TestMatch o = new TestMatch();
            o.setValue(score, over, target);
            double reqRunRate = o.calculateRunRate();

            int balls = o.calculateBalls();
            o.display(reqRunRate, balls);
        }

    }
}
