/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.activity1;

/**
 *
 * @author Benzee
 */
public class Vehicle {

    private int fuelCapacity;
    private String make;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    private String vehicleNumber;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    private String fuelType;

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    private int cc;

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Vehicle() {
    }

    public Vehicle(int fuelCapacity, String make, String vehicleNumber, String fuelType, int cc) {
        this.fuelCapacity = fuelCapacity;
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.cc = cc;
    }

    @Override
    public String toString() {
        return "*** " + make + " ***\n";
    }

    void displayMake() {
        System.out.println(this.toString());
    }

    void displayBasicInfo() {
        System.out.println("*** " + make + " ***\n--- Basic Information ---\nVehicle Number: " + vehicleNumber + " \nFuelCapacity: " + fuelCapacity + " \nFuel Type: " + fuelType + "\nCC:" + cc + "");
    }
    
    void displayDetailInfo(){
        
    }
    
}
