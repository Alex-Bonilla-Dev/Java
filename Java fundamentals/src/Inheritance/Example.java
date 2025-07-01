package Inheritance;

/**
 *
 * @author Alex Bonilla
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a student object
        Student Alex = new Student("Alex Bonilla", 24, "A12345");
        
        //Display student info
        Alex.displayInfo();
    }

}
