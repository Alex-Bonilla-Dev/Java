package Methods;

/**
 *
 * @author Alex Bonilla
 */
public class Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Call the greet method
     greet("Alex");
    
     //Call the add method and print the result
     int result = add(6, 9);
     
     //Call the checkEven method
     boolean isEven = checkEven(1);
        System.out.println("is 1 even? " + isEven);
    }
  
    /**
     * Prints a greting message for the given name
     * 
     * @param name  The name of the person to greet.
     */
    public static void greet(String name){
        System.out.println("Hello " + name);
    }
    
        /**
     * Add 2 numbers integers and returns the result
     * 
     * @param a First number to add
     * @param b Second number to add
     * @return the sum of a and b
     */
    public static int add(int a, int b){
       return a + b;       
    }
    
        /**
     * Check if a number is even
     * 
     * @param number The number to check.
     * @return true if the number is even, false otherwise.
     */
    public static boolean checkEven(int number){
        return number % 2 == 0;
    }
}
