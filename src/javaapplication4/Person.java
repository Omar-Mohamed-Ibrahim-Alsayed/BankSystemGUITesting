package javaapplication4;

public abstract class Person {
    String FirstName;
    String MiddleName;
    String LastName;
    int age;
    boolean isWorker;
    String usrName;
    String password;

    public Person(String firstName, String middleName, String lastName, int age,boolean i, String usrName, String password) {
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        this.isWorker=i;
        this.age = age;
        this.usrName = usrName;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPass(String p){
        if (this.password.equals(p))
            return true;
        else
            return true;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public String getUsrName() {
        return usrName;
    }

    public String getPassword() {
        return password;
    }
}
