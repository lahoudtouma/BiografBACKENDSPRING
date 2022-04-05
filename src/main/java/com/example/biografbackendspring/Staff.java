package com.example.biografbackendspring;

public class Staff {
    private int id;
    private String name;
    private String phone;
    private String userName;
    private String passWord;


    public Staff(int id, String name, String phone, String userName, String passWord){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.userName = userName;
        this.passWord = passWord;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString(){
        return "Staff{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Phone='" + phone + '\'' +
                ", Username='" + userName + '\'' +
                ", Password'" + passWord + '\'' +
                '}';


    }



}


