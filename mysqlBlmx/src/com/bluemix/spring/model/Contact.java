package com.bluemix.spring.model;

public class Contact {
    private int id;
    private String name;
    private String email;
    private String address;
    private String telephone;
 
    public Contact() {
    }
 
    public Contact(String name, String email, String address, String telephone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.telephone = telephone;
    }
 
    // getters and setters
}