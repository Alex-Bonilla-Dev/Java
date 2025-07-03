/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 * Abstract class representing a general vehicle
 *
 * @author alexb
 */
public abstract class Vehicle {
    //Abstract methodto be implemented by subclass
    public abstract void startEngine();
    
    //Concrete method with default behavior
    public void stopEngine(){
        System.out.println("The engine stopped");
    }
}
