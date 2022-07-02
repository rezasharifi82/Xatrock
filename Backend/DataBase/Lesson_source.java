package xat.DataBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.ArrayList;
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
    public static void new_Lesson(String name) {
        me=new Lesson();
        me.setLessoname(name);
        me.setMemberid(-1);
        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(me);
        tx.commit();
    }


    public static void chat_lesson_save(String name_of_lesson,List<String> messages){
        Lesson_Page me=new Lesson_Page();
        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson_Page.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        for(String  i:messages){
            me.setType_of_activity(0);
            me.setName_of_activity(name_of_lesson);
            me.setChat(i);
            session.save(me);
            me=new Lesson_Page();
        }

        tx.commit();
    }
    public static void chat_lesson_save(String name_of_lesson,String messages){
        Lesson_Page me=new Lesson_Page();
        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson_Page.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
            me.setType_of_activity(0);
            me.setName_of_activity(name_of_lesson);
            me.setChat(messages);
            session.save(me);

        tx.commit();
    }
    public static List<String> chat_lesson_load(String name_of_lesson){
        List<String> fresult=new ArrayList<>();
        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson_Page.class);
        SessionFactory sf= con.buildSessionFactory();
        String b=name_of_lesson;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Lesson_page a where (a.name_of_activity= :b)");
        q.setParameter("b",b);
        q.addEntity(Lesson_Page.class);
        // FIXME: actname is name of that lesson
        List<Lesson_Page> jipo=q.list();
        for( Lesson_Page i: jipo){
            fresult.add(i.getChat());
        }
        //fresult=fresult.subList(0,fresult.size());

        tx.commit();
        return fresult;
    }


    public static void main(String[] args) {
        ArrayList<String> me=new ArrayList<>();
        me.add("well");
        me.add("shell");
        me.add("hell");
        me.add("fuck!");
        String i="Ap";
        chat_lesson_save(i,me);
    }

}
