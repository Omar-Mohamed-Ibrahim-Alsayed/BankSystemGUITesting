package javaapplication4;

import java.util.ArrayList;

public  class Client extends Person{

    ArrayList<Account> accounts = new ArrayList<Account>();
    public  ArrayList<Notification> notifications = new ArrayList<Notification>();
    public ArrayList<Bill> bills= new ArrayList<Bill>();
    Bank b;



    public Client(String firstName, String middleName, String lastName, int age, boolean i, String usrName, String password,Bank b) {
        super(firstName, middleName, lastName, age, i, usrName, password);
        this.b=b;
    }

    public void addAcc(int id,double balance, String type){
        Account tmp = new Account( id, balance, type);
        this.accounts.add(tmp);
        b.addAccount( this);
        tmp=null;
    }

    public Account findAcc(int id){
        for (int i = 0;i<accounts.size();i++){
            if (accounts.get(i).getId()==id){
                return accounts.get(i);
            }
        }
        return null;
    }

    public void getBill(Bill b){
        this.bills.add(b);
    }

    public String viewAccs(){
        if (accounts.isEmpty())
            return "No accounts found";
        for (Account a:accounts) {
            System.out.println("Account id:" +Integer.toString(a.getId())+ "\n"+
                    "Account type:" +a.getType() + "\n"+
                    "Account balance:" +Double.toString(a.getBalance()) + "EGP\n\n\n");
        }
        return("That is all accounts");
    }

    public void buy(int a,String sName,String pName,double price){
        Account f = this.findAcc(a);

        if(f==null){
            this.notifications.add(new Notification("Transfer rejected","you are not the owner of this account"));
        }
        if (price > f.getBalance()){
            this.notifications.add(new Notification(sName,"purchase declined due to insufficient balance"));
        }
        else{
            f.withdraw(price);
            this.notifications.add(new Notification(sName,("Item: "+ pName+ "\nsuccessfully purchased from: "+sName+ "\nprice= "+price)));
        }
    }

    public void transfer(int from, int to, double amount){

        if (from == to){
            this.notifications.add(new Notification("Transfer rejected","you can't transfer to the same account"));
            return;
        }

        Account f = this.findAcc(from);
        Account t = b.findAcc(to);


        if(f==null){
            this.notifications.add(new Notification("Transfer rejected","you are not the owner of this account"));
        }
        else if(t==null){
            this.notifications.add(new Notification("Transfer rejected","there is nod account with this id"));
        }
        else if (amount > f.getBalance()){
            this.notifications.add(new Notification("Transfer rejected","transfer declined due to insufficient balance"));
        }
        else{
            f.withdraw(amount);
            t.deposit(amount);
            this.notifications.add(new Notification("Transfer accepted",("from: "+ f.getId()+ "\nto: "+t.getId()+"\namount: "+amount+ "\ncurrent balance= "+f.getBalance())));
        }
    }

    public void payBill(int from, Bill bill){
        Account f = this.findAcc(from);

        if(f==null){
            this.notifications.add(new Notification("payment rejected","you are not the owner of this account"));
        }
        else if (bill.getAmount() > f.getBalance()){
            this.notifications.add(new Notification("Payment rejected","Payment declined due to insufficient balance"));
        }
        else{
            f.withdraw(bill.getAmount());
            this.bills.remove(bill);
            this.notifications.add(new Notification("Payment accepted",("from: "+ f.getId()+ "\nsrc: "+bill.getSrc()+"\namount: "+bill.getAmount()+ "\ncontent of bill: "+bill.getContent()+"\ncurrent balance= "+f.getBalance())));
        }
    }
}
