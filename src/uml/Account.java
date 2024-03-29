/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uml;

/**
 *
 * @author hoang
 */
public abstract class Account {
    private int idNum; // identity number for this account
    private double balance; // current balance for this account
    
    public Account(int idNumber, double startBal){
        if(startBal > 0.0){
            idNum = idNumber;
            balance = startBal;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    public int idNumber(){
        return idNum;
    }
    
    public double currentBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        if(amount > 0.0){
            balance += amount;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    public void decreaseBalance(double amount){
        if(amount >= 0.0 && amount <= balance){
            balance -= amount;
        }
        else {
            throw new IllegalArgumentException();
        }
    }
    
    public abstract double monthlyInterest();
}
