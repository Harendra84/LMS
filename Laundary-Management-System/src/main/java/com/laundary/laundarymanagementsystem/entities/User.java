package com.laundary.laundarymanagementsystem.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @Column (length = 50)
    private String fullName;

    @Column(length = 50, unique = true)
    private String email;

    @Column(length = 30, unique = true)
    private String phone;

    @Column(length = 50, unique = true)
    private String password;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "user")
    @JsonManagedReference
    private List<LaundaryDetails> laundaryDetails;

    public User() {
    }

    public User(Integer userId, String fullName, String email, String phone, String password, List<LaundaryDetails> laundaryDetails) {
        this.userId = userId;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.laundaryDetails = laundaryDetails;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LaundaryDetails> getLaundaryDetails() {
        return laundaryDetails;
    }

    public void setLaundaryDetails(List<LaundaryDetails> laundaryDetails) {
        this.laundaryDetails = laundaryDetails;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", laundaryDetails=" + laundaryDetails +
                '}';
    }
}
