package com.kodilla.good.patterns.food2door;

public class User {
    private String name;
    private String secondName;
    private String address;
    private int phoneNumber;

    public User(String name, String secondName, String address, int phoneNumber) {
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
