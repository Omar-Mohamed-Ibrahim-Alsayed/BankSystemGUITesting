package javaapplication4;

import java.util.ArrayList;


public class Account {
    private int id;
    private double balance;
    private String type;
    private ArrayList<String> accountStatement;

    Account(int id){
        this.id= id;
        this.balance = 0;
        this.type = "";
    }

    Account(int id,double balance, String type){
        this.id=id;
        this.balance = balance;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getBalance(){
        return balance;
    }


    public void setBalance(double newBalance){
        balance = newBalance;
        accountStatement.add("Total Balance = " + this.balance);
    }

    public String getType(){
        return type;
    }

    public void setType(String newType){
        type = newType;
    }

    public void withdraw(double amount){
        if(amount<=this.balance)
            balance -= amount;
        else
            return;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

}
