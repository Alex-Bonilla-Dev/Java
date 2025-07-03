/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 * Car Class that extend from Vehicle class
 *
 * @author alexb
 */
public class Car extends Vehicle {
    //Providing specific implementation of startEngine()
    
    @Override
    public void startEngine(){
        System.out.println("Car engine started with a key");
    }
}
