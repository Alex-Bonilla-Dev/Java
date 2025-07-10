package StaticVsnNonStatic;

/**
 *
 * @author Alex Bonilla
 */
public class Main {

    /**
     * Main class to test static and non-static behavior
     * 
     */
    public static void main(String[] args) {
        // Create objects
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();      
        
        //Calling static method using class name
        Counter.printStaticCount();  //Static count: 3
        
        // Calling non-static method using objects
        c1.printInstanceCount(); // Instance count: 1
        c2.printInstanceCount(); // Instance count: 1
        c3.printInstanceCount(); // Instance count: 1
        
    }

}
