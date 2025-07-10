/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author alexb
 */
// Smartphone class implementing ElectronicDevice
public class Smartphone implements ElectronicDevice {

    @Override
    public void turnOn() {
        System.out.println("Smartphone is powering on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is shutting down...");
    }
}