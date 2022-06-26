package com.DataBase;

import org.hibernate.*;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.SQLQueryParser;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.List;

public class Member_source {
    public static Member me;

    public static void add_member(Member i){
        me=new Member();
        me.setName(i.getName());
        me.setEmail(i.getEmail());
        me.setHavexam(i.getHavexam());
        me.setMobile(i.getMobile());
        me.setPassword(i.getPassword());
        me.setPosition(i.getPosition());
        me.setDeadline(i.getDeadline());
        me.setLastname(i.getLastname());
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(me);
        tx.commit();


    }
    public static void add_member(String Name,String Email,int ha,int dead,String Mobile,String Pass,String po, String Last){
        me=new Member();
        me.setName(Name);
        me.setEmail(Email);
        me.setHavexam(ha);
        me.setMobile(Mobile);
        me.setPassword(Pass);
        me.setPosition(po);
        me.setDeadline(dead);
        me.setLastname(Last);
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(me);
        tx.commit();


    }
    public static List<Activity> get_member_activity(int memberid){
        List<Activity> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class).addAnnotatedClass(Activity.class);
        SessionFactory sf= con.buildSessionFactory();
        int b=memberid;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Activity a  join Members m on (a.memberid= :b)");
        q.setParameter("b",b);
        q.addEntity(Activity.class);

        fresult=q.list();
        fresult=fresult.subList(0,fresult.size()/2);
        tx.commit();
        return fresult;
    }

    public static List<Exam> get_member_exam(int memberid){
        List<Exam> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class).addAnnotatedClass(Exam.class);
        SessionFactory sf= con.buildSessionFactory();
        int b=memberid;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Exam a  join Members m on (a.memberid= :b)");
        q.setParameter("b",b);
        q.addEntity(Exam.class);

        fresult=q.list();
        fresult=fresult.subList(0,fresult.size()/2);

        tx.commit();
        return fresult;
    }
    public static List<Lesson> get_member_Lesson(int memberid){
        List<Lesson> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class).addAnnotatedClass(Lesson.class);
        SessionFactory sf= con.buildSessionFactory();
        int b=memberid;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Lesson a  join Members m on (a.memberid= :b)");
        q.setParameter("b",b);
        q.addEntity(Lesson.class);

        fresult=q.list();
        fresult=fresult.subList(0,fresult.size()/2);

        tx.commit();
        return fresult;
    }

    public static Member find_by_id(int i){
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        //session.save(me);
        tx.commit();
        me=(Member) session.get(Member.class,i);
        return me;
    }




        //me=(Member)session.get(Member.class,);
        //System.out.println(me);





}
