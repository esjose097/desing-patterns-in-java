/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author jose casal
 */
public class BankAccount {
    private int balance;
    private int overdraftLimit = -500;
    
    public void deposit(int amount){
        balance += amount;
        System.out.println("Deposited: "+amount+", the balance now is: "
        + balance);
    }
    
    public void withdraw(int amount){
        if(balance - amount >= overdraftLimit)
        {
            balance -= amount;
            System.out.println("Withdrew: "+amount+", the balance now is: "
                    + balance);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" + "balance=" + balance + ", overdraftLimit=" + overdraftLimit + '}';
    }
    
    
}
