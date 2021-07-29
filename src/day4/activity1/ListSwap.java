/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class ListSwap {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }
        int firstIndex = scanner.nextInt();
        int secondIndex = scanner.nextInt();

        if (firstIndex > 4 || secondIndex > 4) {
            System.out.println("Swapping index is out of range");
        } else {
            Collections.swap(list, firstIndex, secondIndex);
            System.out.println(list);
        }
    }
}
