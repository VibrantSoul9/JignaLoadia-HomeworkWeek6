package homework6;
/*
6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Program6CircleArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // enter value of radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        // Calculate the area of the circle
        double area = Math.PI * Math.pow(radius, 2);
        // Display the calculated area
        System.out.println("The area of the circle with radius " + radius + " = " + area);
    }

}
