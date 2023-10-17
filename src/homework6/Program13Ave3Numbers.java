package homework6;
/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class Program13Ave3Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Step 1: user to input three numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number:");
        double number2 = scanner.nextDouble();
        System.out.print("Enter the third number:");
        double number3 = scanner.nextDouble();
        // Calculate the average
        double average = (number1 + number2 + number3) / 3;
        //Display the average
        System.out.println("The average of " + number1 + ","+number2 +", and " + number3 + " is: " + average);
    }
}
