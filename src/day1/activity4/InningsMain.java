/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.activity4;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class InningsMain {

    public static void main(String[] args) {

        Innings innings = new Innings();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the team name:");
        innings.setTeamName(scanner.nextLine());
        System.out.println("Enter session:");
        innings.setInningsName(scanner.next());
        System.out.println("Enter runs:");
        innings.setRuns(scanner.nextInt());
        if (innings.getInningsName().toLowerCase().equals("second")) {
            System.out.println("Name:" + innings.getTeamName() + "\nscored: " + innings.getRuns() + "\nMatch Ended");
        } else {
            System.out.println("Name:" + innings.getTeamName() + "\nscored: " + innings.getRuns() + "\nNeed " + (innings.getRuns() + 1) + " to win");
        }

    }

}
