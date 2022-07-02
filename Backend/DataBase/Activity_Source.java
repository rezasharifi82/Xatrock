package xat.DataBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;

public class Activity_Source {
    public static Activity me;

    public static void save_activity(int mid, String name, Date deadline , int state) {
        me=new Activity();
        me.setActname(name);
        me.setMemberid(mid);
        me.setState(state);
        me.setDeadline(deadline);
        Configuration con=new Configuration().configure().addAnnotatedClass(Activity.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(me);
        tx.commit();
    }

    public static void save_activity(List<Integer> ibm,String name,Date dead,int state ) {
        me=new Activity();

        Configuration con=new Configuration().configure().addAnnotatedClass(Activity.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        for(Integer i:  ibm){
            me.setMemberid(i);
            me.setActname(name);
            me.setDeadline(dead);
            me.setState(state);
            session.save(me);
            me=new Activity();
        }

        tx.commit();
    }
}
