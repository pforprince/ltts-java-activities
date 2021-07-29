/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Benzee
 */
public class Hashset {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            hashSet.add(scanner.nextLine());
        }
        System.out.println(hashSet.size());
    }

}
