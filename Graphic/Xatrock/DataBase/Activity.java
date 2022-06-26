package com.DataBase;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "memberid", nullable = false)
    private Integer memberid;

    @Column(name = "deadline", nullable = false)
    private Date deadline;

    @Column(name = "Actname", nullable = false, length = 45)
    private String actname;

    @Column(name = "state", nullable = false)
    private Integer state;

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

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getActname() {
        return actname;
    }

    public void setActname(String actname) {
        this.actname = actname;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "memberid=" + memberid +
                ", actname='" + actname + '\'' +
                ", state=" + state +
                '}';
    }
}