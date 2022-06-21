package com.DataBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;

public class Lesson_source {
    public static Lesson me;

    public static void new_Lesson(int mid, String name) {
        me=new Lesson();
        me.setLessoname(name);
        me.setMemberid(mid);
        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(me);
        tx.commit();
    }
    public static void new_Lesson(List<Integer> mid, String name) {
        me=new Lesson();

        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();

        for(Integer  i:mid){
            me.setLessoname(name);
            me.setMemberid(i);
            session.save(me);
            me=new Lesson();
        }

        tx.commit();
    }

}
