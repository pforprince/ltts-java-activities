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
public class SuiteACRoom extends HotelRoom {

    int ratePerSqFeet;

    
public SuiteACRoom(String hotelName, boolean hasTV, boolean hasWIFI, int numberOfSqFeet) {
        super(hotelName, hasTV, hasWIFI, numberOfSqFeet);
    }

    int getRatePerSqFeet() {
        if (hasWIFI) {
            return ratePerSqFeet + 2;
        } else {
            return ratePerSqFeet;
        }
    }
}
