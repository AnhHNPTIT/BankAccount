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
public class CurrentAccount extends Account{
    private double checkCharge;
    
    public CurrentAccount(int idNumber, double startBal, double chkCharge){
        super(idNumber, startBal);
        checkCharge = chkCharge;
    }
    
    public void clearCheck(double amount){
        decreaseBalance(amount+checkCharge);
    }
    
    @Override
    public double monthlyInterest(){
        return 0.0;
    }
}
