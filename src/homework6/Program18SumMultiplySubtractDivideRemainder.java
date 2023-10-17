package homework6;
/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class Program18SumMultiplySubtractDivideRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    // input two numbers
    System.out.print("Input first number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Input second number:");
    double num2 = scanner.nextDouble();
    // Execute addition multiply subtraction divide Remainder
    double sum = (num1 + num2);
    double product = (num1 * num2);
    double difference = num1 - num2;
    double quotient = num1 / num2;
    double remainder = num1 % num2;
    // Display resluts
    System.out.println(num1 + " + " + num2 + " = " + sum);
    System.out.println(num1 + " x " + num2 + " = " + product);
    System.out.println(num1 + " - " + num2 + " = " + difference);
    System.out.println(num1 + " / " + num2 + " + " + quotient);
    System.out.println(num1 + " mod " + num2 + " = " + remainder);


    }
}
