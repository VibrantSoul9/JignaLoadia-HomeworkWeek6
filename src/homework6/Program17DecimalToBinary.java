package homework6;

import java.util.Scanner;

/*
17. Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */
public class Program17DecimalToBinary {
    public static void binaryString(int a) {
        System.out.println("Binary number is: " + Integer.toBinaryString(a));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a decimal number: ");
        int x = scanner.nextInt();
        binaryString(x);
        scanner.close();

    }
    }





