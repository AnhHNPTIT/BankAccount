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
public class SavingsAccount extends Account{
    private double intRate; //annual interest rate 
    
    public SavingsAccount(int idNumber, double balance, double rate){
        super(idNumber, balance);
        intRate = rate;
    }
    
    @Override
    public double monthlyInterest(){
        return (currentBalance() * (intRate/12.0));
    }
    
    public void withdraw(double amount){
        decreaseBalance(amount);
    }
}
