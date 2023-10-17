package homework6;
/*
2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */

public class Programme2 {
    // Declare two static variables
    static String text = "Marks";
    static int number1 = 20;

    // Declare one static method
    static void displayVariables(){

    // Call both static variables into the static method inside a print statement
    System.out.println("text: " + text);
    System.out.println("number1: " + number1);
    }
    // Declare main method
    public static void main(String[] args) {

        // Call the static method into the main method and run the programme
        displayVariables();
    }
    }

