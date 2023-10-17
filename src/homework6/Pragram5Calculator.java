package homework6;

public class Pragram5Calculator {
// Instance variables
private double result;
// Static method for addition
public static String add(double num1, double num2){
    double sum = num1 + num2;
    return num1 + " + " + num2 + " = " + sum;
}
// Static method for subtraction
public static String subtract(double num1, double num2) {
    double difference = num1 - num2;
    return num1 + " - " + num2 + " = " + difference;
}
// Instance method for multiplication
public String multiply(double num1, double num2) {
    result = num1 * num2;
    return num1 + " * "+ num2 + " = " + result;
}
// Instance method for division
public String divide(double num1, double num2) {
    result = num1 / num2;
    return num1 + " / " + num2 + " + " + result;
}
public static void main(String[] args){
    System.out.println("Addition: " + add(5,4));
    System.out.println("Subtraction: " + subtract(9, 4));

// Instance method
Pragram5Calculator calculator = new Pragram5Calculator();
System.out.println("Multiplication: " + calculator.multiply(5, 4));
System.out.println("Division: "+ calculator.divide(9, 3));

}
}
