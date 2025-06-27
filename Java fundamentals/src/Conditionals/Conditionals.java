package Conditionals;

/**
 * Class to demonstrate  conditionals in Java.
 *
 * @author Alex Bonilla
 */
public class Conditionals {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // if-else to check if number is positive, negative or zero
       
        int num = 10; 
       
        if (num == 0){
            System.out.println("The number is zero");
        }
        else if (num < 0){ 
            System.out.println("The number" + num + " is negative");
        }
        else{
            System.out.println("The number " + num + " is positive");
        }
        //Switch example
        char grade = 'A';
        
        switch(grade){
            case 'A': System.out.println("Excellent!");
            case 'B': System.out.println("Notable");
            case 'C': System.out.println("Nice");
            case 'D': System.out.println("You can do it better.");
            default: System.out.println("Grade not recognized.");
        }
    }

}
