package org.example;

public class BankAccount {
    private int accountNumber;
    private String name;
    private double balance;
    private double limit;

    public BankAccount(int accountNumber, String name, double balance, double limit) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.limit = limit;
    }

    // getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    // method to top up the account
    public void topUpAccount(double amount) {
        balance += amount;
        System.out.println("Your account's balance after topping it up is " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456, "John Doe", 1000.0, 5000.0);
        double amount = 50.0;
        account.topUpAccount(amount);
    }
}