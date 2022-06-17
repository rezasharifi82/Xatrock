package com.example.temp;

import jakarta.persistence.*;

@Entity
@Table(name = "Members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "memberid", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "Lastname", nullable = false, length = 45)
    private String lastname;

    @Column(name = "position", nullable = false, length = 45)
    private String position;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "Password", nullable = false, length = 45)
    private String password;

    @Column(name = "Mobile", nullable = false, length = 45)
    private String mobile;

    @Column(name = "havexam")
    private Integer havexam;

    @Column(name = "deadline")
    private Integer deadline;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getHavexam() {
        return havexam;
    }

    public void setHavexam(Integer havexam) {
        this.havexam = havexam;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "lastname = " + lastname + ", " +
                "position = " + position + ", " +
                "email = " + email + ", " +
                "password = " + password + ", " +
                "mobile = " + mobile + ", " +
                "havexam = " + havexam + ", " +
                "deadline = " + deadline + ")";
    }



}