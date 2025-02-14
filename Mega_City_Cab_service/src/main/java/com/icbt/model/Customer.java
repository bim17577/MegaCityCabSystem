package com.icbt.model;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String address;
    private int phonenumber;
    private int nic;

    public Customer(int customerId, String name, String email, String address, int phonenumber, int nic) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.nic = nic;
    }

    public Customer(int customerId, String name, String email) { // ✅ Fixed "nam" to "name"
        this.customerId = customerId;
        this.name = name;
        this.email = email;
    }

    public Customer() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getNic() {
        return nic;
    }

    public void setNic(int nic) {
        this.nic = nic;
    }
} // ✅ Removed extra comma and fixed constructor
