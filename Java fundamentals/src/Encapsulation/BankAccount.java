/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encapsulation;

/**
 * This class represent a bank account with private fields
 * It uses getter and setter methods to control access to data.
 * @author alexb
 */
public class BankAccount {
    //Private fields 
    private String owner;
    private double balance;
    
    //Constructor
    public BankAccount(String owner, double initialBalance){
        this.owner = owner;
       //Condition to balance be more than 0
       if(initialBalance > 0){ 
       this.balance = initialBalance;
       }
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: "+ amount+ "€");
            System.out.println("New balance: "+ balance+ "€");
        }
        else{
            System.out.println("Invalid deposit amount. ");
        }
    }
     // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount+ "€");
            System.out.println("Remaining Balance: " + balance+ "€");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    
}
}