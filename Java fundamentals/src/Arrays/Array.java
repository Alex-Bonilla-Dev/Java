package Arrays;

/**
 * Class to demostrate arrays in Java
 * 
 * @author Alex Bonilla
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare and initialize an array of numbers integers
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        //Print all elements using a for loop
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Element at index: "+ i + "the number is: "+ num[i] );
            
        }
        //Example of calculate the sum of all elements
        int sum = 0; 
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            
        }
        System.out.println("Sum of all elements: " + sum);
    }

}
