package Class_and_Object;

/**
 *
 * @author Alex Bonilla
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // Create 2 person objects
        Person Alex = new Person("Alex", 24);
        Person Jose = new Person("Jose", 30);
       
        //Example of getter and setter
        System.out.println(Alex.getName());
        System.out.println(Alex.getAge()); 
        System.out.println(Jose.getName());
        System.out.println(Jose.getAge()); 
        
        Jose.setName("Juan");
        Jose.setAge(40);
       
        System.out.println(Jose.getName()); 
        System.out.println(Jose.getAge());
        
        
        //Call the methods to display info
        Alex.displayInfo();
        Jose.displayInfo();
     
    }
}
