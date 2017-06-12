package com.company;

/**
 * Created by hackeru on 6/12/2017.
 */
public class Person {
    private String name;
    private String address;
    private String phone;
    private boolean available;

    public Person(String name, String address, String phone, boolean available) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
