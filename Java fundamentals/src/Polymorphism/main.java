package Polymorphism;

/**
 *
 * @author Alex Bonilla
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating an Animal reference to reference to different subclass objects
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        //Calling the same method on different objects
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        
        //Test the overloaded methods
        Overloading calc = new Overloading();
        System.out.println("The sum of two numbers integers: " + calc.add(5,11));
        System.out.println("The sum of three numbers integers: " + calc.add(6,1, 22));
        System.out.println("The sum of two numbers doubles: " + calc.add(1.2,2.8));
        
        
    }

}
