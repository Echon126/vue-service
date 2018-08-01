package com.example.test.data;

import java.util.Date;

public class TableData {
    private String name;
    private int age;
    private String address;
    private Date data;

    public TableData(String name, int age, String address, Date data) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
