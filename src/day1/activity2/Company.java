/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1.activity2;

/**
 *
 * @author Benzee
 */
public class Company {

    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (employee.contains(teamLead)) {
            return "Name: " + name + "\nEmployees: " + employee + "\nTeamLead: " + teamLead;
        } else {
            return "Invalid Output";
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    private String employee;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }
    private String teamLead;

    public String getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(String teamLead) {
        this.teamLead = teamLead;
    }
}
