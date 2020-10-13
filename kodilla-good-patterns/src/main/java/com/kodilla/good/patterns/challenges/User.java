package com.kodilla.good.patterns.challenges;

public class User {
    private String name;
    private String secondName;
    private String nickName;
    private String address;
    private int phoneNumber;

    public User(String name, String secondName, String nickName, String address, int phoneNumber) {
        this.name = name;
        this.secondName = secondName;
        this.nickName = nickName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
