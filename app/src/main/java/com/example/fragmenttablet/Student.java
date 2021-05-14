package com.example.fragmenttablet;

import java.io.Serializable;

public class Student implements Serializable {
    private String Name;
    private int Year;
    private String Address;
    private String Email;

    public Student(String name, int year, String address, String email) {
        Name = name;
        Year = year;
        Address = address;
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
