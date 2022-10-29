package com.example.freelancewebsite.Model;

public class UserRest {
    private int Useruid;
    private String firstname;
    private String lastname;
    private String address;
    private String username;
    private String Expertise;
    private String email;
    public String getExpertise() {
        return Expertise;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setExpertise(String expertise) {
        Expertise = expertise;
    }

    public void setUseruid(int useruid) {
        Useruid = useruid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUseruid() {
        return Useruid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    public String getUsername() {
        return username;
    }
}
