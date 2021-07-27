/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.activity2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Benzee
 */
public class CompanyMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Company company = new Company();
        System.out.println("Enter the company name:");
        company.setName(scanner.nextLine());
        System.out.println("Enter the employees:");
        company.setEmployee(scanner.nextLine());
        String employees[] = company.getEmployee().split(",");
        System.out.println("Enter TeamLead:");
        company.setTeamLead(scanner.nextLine());
//        System.out.println(company.toString());
        if (Arrays.asList(employees).contains(company.getTeamLead())) {
            System.out.println("Name: " + company.getName() + "\nEmployees: " + company.getEmployee() + "\nTeamLead: " + company.getTeamLead());
        } else {
            System.out.println("Invalid Output");
        }
    }
}
