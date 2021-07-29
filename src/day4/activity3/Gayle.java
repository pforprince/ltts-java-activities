/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class Gayle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfInnings = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < noOfInnings; i++) {
            list.add(scanner.nextInt());
        }

        int fiftees = 0, centuries = 0;
        for (int i = 0; i < noOfInnings; i++) {
            if (list.get(i) >= 50 && list.get(i) < 100) {
                fiftees++;
            } else if (list.get(i) >= 100) {
                centuries++;
            }
        }
        System.out.println(fiftees + "\n" + centuries);
    }
}
