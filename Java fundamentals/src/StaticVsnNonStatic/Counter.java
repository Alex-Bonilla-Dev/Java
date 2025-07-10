/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticVsnNonStatic;

/**
 * Class demostrating static and non-static members
 * 
 * @author alexb
 */
public class Counter {
    static int staticCount = 0; //Shared among all objects
    int instanceCount = 0; //Unique to each object
    
    //Constructor
    public Counter(){
        staticCount++; 
        instanceCount++;
    }
    
//Static method
    public static void printStaticCount(){
        System.out.println("Static Count: "+ staticCount);
    }
    
    //Non-static method
    public void printInstanceCount(){
        System.out.println("Instance Count. "+ instanceCount);
    }
}
