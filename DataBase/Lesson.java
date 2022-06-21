package com.DataBase;

import jakarta.persistence.*;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLesson", nullable = false)
    private Integer id;

    @Column(name = "memberid", nullable = false)
    private Integer memberid;

    @Column(name = "lessoname", nullable = false, length = 45)
    private String lessoname;

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

    public String getLessoname() {
        return lessoname;
    }

    public void setLessoname(String lessoname) {
        this.lessoname = lessoname;
    }

}