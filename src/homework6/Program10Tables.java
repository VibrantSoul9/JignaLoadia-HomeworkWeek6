package homework6;
/*10. Write a Java program that takes a number as input and prints its
multiplication table up to 10.
Test Data: Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80

 */

import java.util.Scanner;

public class Program10Tables {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
     // user need to input a number
     System.out.println("Enter a number: ");
     int number = scanner.nextInt();
     // Print table of the nuber up to 10
        System.out.println("Multiplication Table for " + number + ": ");
        for (int i = 1; i<= 10; i++){
            System.out.println(number + " x " + i + " = " +(number * i));
        }
    }
}
