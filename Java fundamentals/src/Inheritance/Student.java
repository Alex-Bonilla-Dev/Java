/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 * This class inherits from Person
 * It adds specific atributes for a student
 * @author alexb
 */
public class Student extends Person {
    private String ID;
   
    // constructor
    public Student(String name, int age, String ID){
        //Call the superclass constructor
        super(name, age);
        this.ID = ID;
    }
    //Method to display full student info
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student ID: "+ID);
    }
}
