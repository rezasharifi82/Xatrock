package xat.DataBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Exam_source {
    public static Exam me;

    public static void save_exam(int mid, String name,String time) {
        me=new Exam();
        me.setName(name);
        me.setMemberid(mid);
        me.setTime(time);
        Configuration con=new Configuration().configure().addAnnotatedClass(Exam_source.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(me);
        tx.commit();
    }
    public static void save_exam(List<Integer> mid, String name, String time) {
        me=new Exam();
        Configuration con=new Configuration().configure().addAnnotatedClass(Exam_source.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        for (Integer i :mid){

            me.setName(name);
            me.setMemberid(i);
            me.setTime(time);
            session.save(me);


            me=new Exam();
        }
        tx.commit();
    }
}
