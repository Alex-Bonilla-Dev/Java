/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 * Laptop class implementing ElectronicDevice
 * 
 * @author alexb
 */
public class Laptop implements ElectronicDevice {
    
    @Override
    public void turnOn(){
        System.out.println("Lapton is booting up...");
    }
    
    @Override
    public void turnOff(){
        System.out.println("Laptop is powering down...");
    }
}
