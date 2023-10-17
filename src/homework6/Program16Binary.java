package homework6;
/*
16. Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101
 */

public class Program16Binary {
    public static void main(String[] args) {
        int a = Integer.parseInt(String.valueOf(10), 2);
        int b = Integer.parseInt(String.valueOf(11), 2);
        int sum = a + b;
        String binarySum = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: " + binarySum);
    }
}

