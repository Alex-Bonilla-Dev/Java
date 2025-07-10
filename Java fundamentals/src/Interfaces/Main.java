package Interfaces;

/**
 * Main class to test the interfaces
 *
 * @author Alex Bonilla
 */
public class Main {

    public static void main(String[] args) {
        // Creating Objects
        ElectronicDevice phone = new Smartphone();
        ElectronicDevice laptop = new Laptop();
        
        //Turning on devices
        phone.turnOn();
        laptop.turnOn();
        
        //Turning off devices
        phone.turnOff();
        laptop.turnOff();

    }

}
