/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class RunRate {

    public static void main(String[] args) {

        int runScored, overFaced;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            System.out.println((double)10/(double)0);
            System.out.println("Enter the total runs scored");
            runScored = Integer.parseInt(reader.readLine());

            System.out.println("Enter the total overs faced");
            overFaced = Integer.parseInt(reader.readLine());

            double runRate = Math.round((double) runScored / (double) overFaced * 100.0) / 100.0;
            System.out.println("Current Run Rate :" + runRate);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

    }
}
