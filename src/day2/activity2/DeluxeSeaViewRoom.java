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
public class DeluxeSeaViewRoom extends DeluxeRoom {

    public DeluxeSeaViewRoom(int ratePerSqFeet, String hotelName, boolean hasTV, boolean hasWIFI, int numberOfSqFeet) {
        super(ratePerSqFeet, hotelName, hasTV, hasWIFI, numberOfSqFeet);
        ratePerSqFeet = 12;
    }

}
