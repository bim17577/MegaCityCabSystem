package com.icbt.model;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private String address;
    private String phonenumber; 
    private String nic; 

    public Customer(int customerId, String name, String email, String address, String phonenumber, String nic) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.nic = nic;
    }

    public Customer(int customerId, String name, String email) {
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }
}
