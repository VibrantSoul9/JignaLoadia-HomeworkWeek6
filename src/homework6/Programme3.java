package homework6;
/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    // Declare one instance variable
    private int instanceJ;
    //Declare one static veriable
    private static int staticL;

    //Declare one instance method
    public void instanceMethod() {
    // Call both instance and static variable into instance method inside the print statement
    System.out.println("Instance Variable: " + instanceJ);
    System.out.println("Static Variable:" + staticL);
    }
    // Declare one static method
    public static void staticMethod() {
    //Call both instance and static variable into the static method inside print statement
    Programme3 instance = new Programme3();
    System.out.println("Instance Variable in Static Method: " + instance.instanceJ);
    System.out.println("Static Variable in Static Method: " + staticL);
    }
    // Declare the Main method
    public static void main(String[] args) {
    // Call both instance and static methods into the Main method and run the program
    Programme3 instance = new Programme3();
    instance.instanceJ = 100;
    staticL = 101;
    instance.instanceMethod();
    staticMethod();
    }
}
