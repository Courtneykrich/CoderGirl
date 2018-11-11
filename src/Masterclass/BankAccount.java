package Masterclass;

import java.util.Scanner;
public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        System.out.println("Empty constructor called");
    }
    public BankAccount(int number, double balance, String customerName, String email, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("BankAccount constructor with parameters called");
    }
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" made, new balance is "+this.balance+".");

    }
    public void withdrawal(double withdrawalAmount){
       if (balance- withdrawalAmount <0){
           System.out.println("Only "+balance+" available. Withdrawal not processed");
       }else {
           this.balance -=withdrawalAmount;
           System.out.println("Withdrawal of "+withdrawalAmount+" processed. Remaining balance = "+balance+".");
       }

       }


    public void setNumber(int accountNumber) {
        this.number = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}


