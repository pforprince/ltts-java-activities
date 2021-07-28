/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.activity1;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        System.out.println("Circle\nSquare\nEnter the shape");
        Scanner scanner = new Scanner(System.in);
        String val = scanner.next();
        Shape shape = null;
        if (val.toLowerCase().equals("circle")) {
            shape = new Circle();
            System.out.println("Enter the Radius:");
            int value = scanner.nextInt();
            shape.setValue(value);
            System.out.println("Area of Circle is: " + shape.calculateArea(shape.getValue()));
        } else if (val.toLowerCase().equals("square")) {
            shape = new Square();
            System.out.println("Enter the Side:");
            int value = scanner.nextInt();
            shape.setValue(value);
            System.out.println("Area of Square is: " + shape.calculateArea(shape.getValue()));
        }
    }
}
