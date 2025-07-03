/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstraction;

/**
 * Moto class that extends from Vehicle Class
 * @author alexb
 */
public class Motorcycle extends Vehicle{
    //Providing specific implementation of startEngine();
    @Override
    public void startEngine(){
        System.out.println("Motorcycle engine started with a key");
    }
}
