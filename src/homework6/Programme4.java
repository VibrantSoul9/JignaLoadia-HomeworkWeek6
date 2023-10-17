package homework6;
/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
    // Declare two instance variables
    private int exam1;
    private int exam2;
    //Declare two static variables
    private static int chemistry;
    private static int biology;

    // Declare one instance method
    public void instanceMethod() {
        // Call all four variables into the instance method inside print statements
        System.out.println("Instance Variable (exam1): " + exam1);
        System.out.println("Instance Variable (exam2); " + exam2);
        System.out.println("Stativ Variable (chemistry): " + chemistry);
        System.out.println("Static Variable (biology): " + biology);
    }

    // Declare one static method
    public static void staticMethod() {
        // Call al four variables into the static method inside print statements
        System.out.println("Static Variable (chemisty) in Static Method: " + chemistry);
        System.out.println("Static Variable (biology) in Static Method: " + biology);
    }

    // Declare the Main method
    public static void main(String[] args) {
        // Call both instance and static methods into to the Main method and run the program
        Programme4 instance = new Programme4();
        instance.exam1 = 91;
        instance.exam2 = 92;
        chemistry = 90;
        biology = 89;
        // Call the instance method
        instance.instanceMethod();
        // Call the static method
        staticMethod();
    }
}





