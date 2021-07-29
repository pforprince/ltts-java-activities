/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class RetainAll {

    public static void main(String[] args) {

        List<String> season13 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the top 5 scorer of IPL Season 13");
        for (int i = 0; i < 5; i++) {
            season13.add(scanner.nextLine());
        }

        System.out.println("Enter the top 5 scorer of IPL Season 14");
        List<String> season14 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            season14.add(scanner.nextLine());
        }
        System.out.println("Consistent Run Scorers");
        season14.retainAll(season13);
        System.out.println(season14);

    }
}
