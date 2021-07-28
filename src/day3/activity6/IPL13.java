/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class IPL13 {

    static void ipl13Season() throws TeamNameNotFoundException {
        String teams[] = {"Chennai Super Kings", "Sun Risers Hyderabad",
            "Mumbai Indians", "Royal Challengers Bangalore", "Delhi Capitals",
            "Kings X1 Punjab", "Kolkata Knight Riders", "Rajasthan Royals"
        };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the expected winner team of IPL Season 13");
        String winnerTeam = scanner.nextLine();
        System.out.println("Enter the expected runner Team of IPL Season 13");
        String runnerUpTeam = scanner.nextLine();
        if (Arrays.asList(teams).contains(winnerTeam) && Arrays.asList(teams).contains(runnerUpTeam)) {
            System.out.println("Expected IPL Season 13 winner: " + winnerTeam + "\nExpected IPL Season 13 runner: " + runnerUpTeam);
        } else {
            throw new TeamNameNotFoundException("TeamNameNotFoundException: Entered team is not a part of IPL Season 13");
        }
    }

    public static void main(String[] args) {
        try {
            ipl13Season();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
