package com.example.usermanagementsystem.model;

import javax.persistence.*;


@Entity
@Table(name = "users_tb")
public class UserModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "creationTime")
    private String creationTime;

    @Column(name = "emailAddress")
    private String emailAddress;

    public UserModel() {
    }

    public UserModel(String firstName, String lastName, String creationTime, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creationTime = creationTime;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String dataCreated) {
        this.creationTime = dataCreated;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
