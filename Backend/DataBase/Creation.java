package xat.DataBase;

import jakarta.persistence.Persistence;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Creation {

    public static List<Activity> get_member_activity(int memberid){
        List<Activity> fresult;
        Configuration con=new Configuration().configure("MechaCTR.xml").addAnnotatedClass(Lesson_Page.class);
        SessionFactory sf= con.buildSessionFactory();

        int b=memberid;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();


        Lesson_Page me=new Lesson_Page();
        me.setName_of_activity("sad");
        me.setType_of_activity(4);

        tx.commit();
        return null;
    }

    public static String asd(){
        return "sdaas";
    }

    public static void main(String[] args) {
        get_member_activity(5);

    }
}
