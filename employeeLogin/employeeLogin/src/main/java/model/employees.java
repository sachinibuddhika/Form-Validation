package model;

public class employees {

    //declaring attributes
    String name;
    String userName;
    String password;

    //declaring getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //declaring constructor
    public employees(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    //declaring constructor using super class
    public employees(){
        super();
    }

    //to String
    @Override
    public String toString() {
        return "employees{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
