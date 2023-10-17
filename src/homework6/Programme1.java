package homework6;
/*
1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.

 */
public class Programme1 {
    // Declare two instance variables
        private String name;
        private String surname;

    // Decalre one instance method
    public void displayVariables() {

    //call both instance variables into the instance method inside the print statement
        System.out.println("name:" + name);
        System.out.println("surname:" + surname);
    }
    //Declare the main method
    public static void main(String[] args) {
        Programme1 example = new Programme1();

    //Call the instance method into the main method to display the variables
        example.name = "Radha";
        example.surname = "Krishan";
        example.displayVariables();



    }
}
