/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity5;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Benzee
 */
public class PlayerOfTheMatch {

    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            treeSet.add(scanner.nextLine());
        }

        System.out.println(treeSet);
    }
}
