/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 * This class is superclass
 *  It contains methods and attributes shared by all people
 * @author alexb
 */
public class Person {
    protected String name;
    protected int age;

public Person(String name, int age){
this.name = name;
this.age = age;

}
//Method to display info
public void displayInfo(){
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
}

}
