/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.activity6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Benzee
 */
public class DisplayTeamMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.nextLine();
        Map<String, TeamClass> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            String input = scanner.nextLine();
            String splitAr[] = input.split("\\|");
            if (map.containsKey(splitAr[0])) {
                TeamClass getTeam = map.get(splitAr[0]);
                getTeam.addPlayer(splitAr[1]);
            } else {
                TeamClass t2 = new TeamClass(splitAr[0]);
                t2.addPlayer(splitAr[1]);
                map.put(splitAr[0], t2);
            }
        }
        for (Map.Entry<String, TeamClass> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            Collections.sort(entry.getValue().playerList);
            for (int i = 0; i < entry.getValue().playerList.size(); i++) {
                System.out.println("--" + entry.getValue().playerList.get(i));
            }
        }
    }
}

//csk -dhoni, raina
