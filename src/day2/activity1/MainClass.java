/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.activity1;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
        int fourWheelerType = scanner.nextInt();
        scanner.nextLine();
        if (fourWheelerType == 1) {
            FourWheeler fourWheeler = new FourWheeler();

            System.out.println("Vehicle make: ");
            fourWheeler.setMake(scanner.nextLine());
            System.out.println("Vehicle Number: ");
            fourWheeler.setVehicleNumber(scanner.next());
            System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
            int val = scanner.nextInt();
            scanner.nextLine();
            if (val == 1) {
                fourWheeler.setFuelType("Petrol");
            } else {
                fourWheeler.setFuelType("Diesel");
            }
            System.out.println("Fuel Capacity:");
            fourWheeler.setFuelCapacity(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Engine CC:");
            fourWheeler.setCc(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Audio System:");
            fourWheeler.setAudioSystem(scanner.nextLine());

            System.out.println("No of doors:");
            fourWheeler.setNumberOfDoors(scanner.nextInt());
            scanner.nextLine();

            fourWheeler.displayBasicInfo();
            fourWheeler.displayDetailInfo();
        } else if (fourWheelerType == 2) {
            TwoWheeler twoWheeler = new TwoWheeler();
            System.out.println("Vehicle make: ");
            twoWheeler.setMake(scanner.nextLine());
            System.out.println("Vehicle Number: ");
            twoWheeler.setVehicleNumber(scanner.next());
            System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
            int val = scanner.nextInt();
            scanner.nextLine();

            if (val == 1) {
                twoWheeler.setFuelType("Petrol");
            } else {
                twoWheeler.setFuelType("Diesel");
            }
            System.out.println("Fuel Capacity:");
            twoWheeler.setFuelCapacity(scanner.nextInt());
            scanner.nextLine();

            System.out.println("Engine CC:");
            twoWheeler.setCc(scanner.nextInt());
            scanner.nextLine();

            System.out.println("KickStart Available:");
            twoWheeler.setKickStartAvailable(scanner.nextBoolean());

            twoWheeler.displayBasicInfo();
            twoWheeler.displayDetailInfo();
        } else {
            System.out.println("Wrong input");
        }

    }
}
