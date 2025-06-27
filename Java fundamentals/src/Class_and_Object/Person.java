/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_and_Object;

/**
 *
 * @author alexb
 */
public class Person {
    //Atributtes
    String name;
    int age;

//Constructor to initialize the object
public Person(String name, int age){
    this.name = name;
    this.age = age;
}
//Get name
public String getName(){
    return name;
}
//Set name
public void setName(String name){
    this.name=name;
}
//Get age
public int getAge(){
    return age;
}
//Set age
public void setAge(int age){
    this.age=age;
}

//Method to display information
public void displayInfo(){
    System.out.println("Name: "+ name + " Age: "+age);
}
}
