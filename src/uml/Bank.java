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
public class Bank {
    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount(1111, 1000.0, 7);
        CurrentAccount ca = new CurrentAccount(2222, 2000.0, 1.2);
        CurrentPlusAccount cp = new CurrentPlusAccount(3333, 3000.0, 1, 200, 2.5);
        
        System.out.println("CurrentPlusAccount Balance:>>>>>>>>>>" + cp.currentBalance());
        System.out.println("SavingsAccount Balance:>>>>>>>>>>" + sv.currentBalance());
        System.out.println("CurrentAccount Balance:>>>>>>>>>>" + ca.currentBalance());
        System.out.println("CurrentPlusAccount Interest:>>>>>>>>>>" + cp.monthlyInterest());
        System.out.println("SavingsAccount Interest:>>>>>>>>>>" + sv.monthlyInterest());
        System.out.println("CurrentAccount Interest:>>>>>>>>>>" + ca.monthlyInterest());
    }
}
