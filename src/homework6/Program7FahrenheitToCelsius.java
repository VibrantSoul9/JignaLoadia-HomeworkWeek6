package homework6;
/*
7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class Program7FahrenheitToCelsius {
    public static void main(String[] args){
        // write temperature in degree fahrenheit
        double fahrenheit = 97.8;
        // Convert the temperature from Farenheit to Celsius
        double celsius = (fahrenheit - 32) * 5/9;
        // Display the temp in degree celsius
        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius.");
    }
}
