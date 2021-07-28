/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity5;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class Age {

    int playerAge;
    String playerName;

    static void getData() throws InvalidAgeRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the player name");
        String name = scanner.nextLine();
        System.out.println("Enter the player age");
        int age = scanner.nextInt();

        if (age < 19) {
            throw new InvalidAgeRangeException("CustomException: InvalidAgeRangeException");
        }else{
            System.out.println("Player name: "+ name +"\nPlayer age: "+ age);
        }
    }

    public static void main(String[] args) {
        try {
            getData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
