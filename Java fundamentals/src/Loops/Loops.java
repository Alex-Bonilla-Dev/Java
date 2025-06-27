package Loops;

/**
 * Class to demostrate the use of loops in Java
 * 
 * @author Alex Bonilla
 */
public class Loops {

    /**
     *  This method run when the program run
     * 
     * @param args the command line arguments (Not used)
     */
    public static void main(String[] args) {
        // For Loop that prints from 1 to 10.
        for(int i = 0; i < 10; i++){
            System.out.println("Loop iteration: "+i);
        }
        
        // While Loop that counts down from 5 to 1
        int count = 5;
        while(count> 0){
            System.out.println("Counting down: "+ count);
            count--;
        }
        
        
    }

}
