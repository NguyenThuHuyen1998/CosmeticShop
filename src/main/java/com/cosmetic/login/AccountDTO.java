package com.cosmetic.login;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "account")
public class AccountDTO {
    private String username;
    private String fullname;
    private String password;
    private String phone;
    private String email;
    private String address;
    private String role;

    public AccountDTO(String username, String fullname, String password, String phone, String email, String address, String role) {
        this.username = username;
        this.fullname = fullname;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
