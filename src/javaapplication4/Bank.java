package javaapplication4;

import java.util.ArrayList;

public  class Bank {
    public static ArrayList<Client> clients= new ArrayList<Client>();
    public static ArrayList<Account> accounts= new ArrayList<Account>();
    public static ArrayList<Company> companies= new ArrayList<Company>();
    //clients.add(new Client("Omar","Mohamed","Elsayed",20,false,"Omar","Omar",this));
    //clients.get(0).addAcc(1, 10000, "Savings");
   

    public  boolean addClient(String firstName, String middleName, String lastName, int age, String usrName, String password){
        clients.add(new Client( firstName,  middleName,  lastName,  age,  false,  usrName,  password,this));
        return true;
    }
public void Bank(){
    this.clients.add(new Client("Omar","Mohamed","Elsayed",20,false,"Omar","Omar",this));
    this.clients.get(0).addAcc(1, 10000, "Savings");

}
    public boolean addCompany(String name,double balance){
        companies.add(new Company(name, balance, this));
        return true;
    }

    public void addAccount(Client c){
        Account tmp = c.accounts.get(c.accounts.size()-1);
        accounts.add(tmp);
    }

    public static Client findClnt(String usrnm){
        for (int i = 0;i<clients.size();i++){
            if (clients.get(i).getUsrName().equals(usrnm)){
                return clients.get(i);
            }
        }
        return null;
    }

    public Company findCompany(String name){
        for (int i = 0;i<companies.size();i++){
            if (companies.get(i).cName.equals(name)){
                return companies.get(i);
            }
        }
        return null;
    }

    public Account findAcc(int id){
        for (int i = 0;i<accounts.size();i++){
            if (accounts.get(i).getId()==id){
                return accounts.get(i);
            }
        }
        return null;
    }

    boolean deleteClient(String userName){
        for(int i = 0; i < clients.size(); i++){
            if(userName.equals(clients.get(i).getUsrName())){
                clients.remove(i);
                return true;
            }
        }
        return false;
    }

    ArrayList<Client> viewClients(){
        return clients;
    }

}
