package homework6;
/*
14. Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programe14AreaAndPerimeterRectangle {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;
    // Calculate the area and perimeter of rectange
        double area = width * height;
        double perimeter = 2 *(width + height);
    // Execute the result
        System.out.println("Rectange with width " + width + " and height " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}
