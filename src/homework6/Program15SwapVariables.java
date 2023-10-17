package homework6;
/*
15. Write a Java program to swap two variables.
 */

public class Program15SwapVariables {
    public static void main(String[] args) {
        // Define two variables
        int a = 7;
        int b = 9;
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Swap the varibales
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
