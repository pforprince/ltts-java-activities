/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.activity2;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class HotelMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe Sea view Room\n3. Suite AC Room\nSelect Room Type:");
        int hotelType = s.nextInt();
        s.nextLine();
        System.out.println("Hotel Name:");
        String hotelName = s.nextLine();
        System.out.println("Room Square Feet Area:");
        int sqFeet = s.nextInt();
        s.nextLine();
        System.out.println("Room has TV (yes/no):");
        String inputhasTV = s.next();
        boolean hasTV = false;
        if (inputhasTV.toLowerCase().equals("yes")) {
            hasTV = true;
        } else {
            hasTV = false;
        }
        System.out.println("Room has Wifi (yes/no):");
        String inputHasWifi = s.next();
        boolean hasWifi = false;
        if (inputHasWifi.toLowerCase().equals("yes")) {
            hasWifi = true;
        } else {
            hasWifi= false;
        }
        HotelRoom room = null;
        if (hotelType == 1) {
            room = new DeluxeSeaViewRoom(sqFeet, hotelName, hasTV, hasWifi, sqFeet);
//            System.out.println("Room Tariff per day is: " + deluxeRoom.calculateTariff());
        } else if (hotelType == 2) {
            room = new DeluxeSeaViewRoom(sqFeet, hotelName, hasTV, hasWifi, sqFeet);
//            System.out.println("Room Tariff per day is: " + deluxeACRoom.calculateTariff());
        } else if (hotelType == 3) {
            room = new SuiteACRoom(hotelName, hasTV, hasWifi, sqFeet);
//            System.out.println("Room Tariff per day is: " + suiteACRoom.calculateTariff());
        }
        System.out.println(room.calculateTariff());
        System.out.println("Room Tariff per day is: " + room.calculateTariff());
    }
}
