/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.activity3;

import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class CustomerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the details:");
        String inputData = scanner.next();
        String data[] = inputData.split(",");
        Customer customer = new Customer(data[0], data[1], data[2]);
        System.out.println(customer.toString());
    }

}
