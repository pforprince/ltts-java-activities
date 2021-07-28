/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity4;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class Overs {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of overs");
            int size = scanner.nextInt();
            int runsArray[] = new int[size];
            System.out.println("Enter the number of runs for each over");
            for (int i = 0; i < size; i++) {
                runsArray[i] = scanner.nextInt();
            }
            System.out.println("Enter the over number");
            int index = scanner.nextInt();
            System.out.println("Runs scored in this over : " + runsArray[index-1]);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

    }

}
