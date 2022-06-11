package javaapplication4;

public class Admin extends Person{
    int authority;
    String level;
    Bank b;

    public Admin(String firstName, String middleName, String lastName, int age, boolean i, String usrName, String password, int authority, String level,Bank b) {
        super(firstName, middleName, lastName, age, i, usrName, password);
        this.authority = authority;
        this.level = level;
        this.b=b;
    }

    public int getAuthority() {
        return authority;
    }

    public String getLevel() {
        return level;
    }

    public void addClient(String firstName, String middleName, String lastName, int age, String usrName, String password){
        b.addClient( firstName,  middleName,  lastName,  age,  usrName,  password);
    }

    public void addCompany(String name,double balance){
        b.addCompany(name, balance);
    }
}
