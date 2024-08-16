/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.number2;

import java.util.Scanner;

/**
 *


 */
public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

       
       
        Circle circle = new Circle(radius);

        
        
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

       
       
        System.out.printf("Area of the circle: %.2f\n", area);
        System.out.printf("Circumference of the circle: %.2f\n", circumference);

        
        
        scanner.close();
    }
}

