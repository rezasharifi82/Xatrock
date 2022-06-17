package com.example.temp;

import jakarta.persistence.*;

@Entity
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idExam", nullable = false)
    private Integer id;

    @Column(name = "memberid", nullable = false)
    private Integer memberid;

    @Column(name = "Name", nullable = false, length = 45)
    private String name;

    @Column(name = "Time", nullable = false, length = 45)
    private String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberid() {
        return memberid;
    }

    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}