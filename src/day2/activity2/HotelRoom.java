/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.activity2;

/**
 *
 * @author Benzee
 */
public class HotelRoom {

    String hotelName;
    boolean hasTV, hasWIFI;
    int numberOfSqFeet;

    public HotelRoom(String hotelName, boolean hasTV, boolean hasWIFI, int numberOfSqFeet) {
        this.hotelName = hotelName;
        this.hasTV = hasTV;
        this.hasWIFI = hasWIFI;
        this.numberOfSqFeet = numberOfSqFeet;
    }

    int calculateTariff() {
        return numberOfSqFeet * getRatePerSqFeet();
    }

    int getRatePerSqFeet() {
        return 0;
    }
}
