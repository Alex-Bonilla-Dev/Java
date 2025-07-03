package Abstraction;

/**
 *
 * @author Alex Bonilla
 */
public class main {

    /**
     * Main class to test the abstration
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the objects
        Vehicle car = new Car();
        Vehicle moto = new Motorcycle();
        
        //Using polymorphism with abstration
        car.startEngine();
        car.stopEngine();
        
        moto.startEngine();
        moto.stopEngine();
    }

}
