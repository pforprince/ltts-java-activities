/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.activity1;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class Player {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " " + lastName.toUpperCase());

    }
}
