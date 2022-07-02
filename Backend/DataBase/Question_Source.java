package xat.DataBase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Question_Source {
    public static Questions me;
    public static void add_question(String Question ,String op1,String op2 , String op3 , String op4,String lesson_name){
        me=new Questions();
        me.setQuestion(Question);
        me.setOp1(op1);
        me.setOp2(op2);
        me.setOp3(op3);
        me.setOp4(op4);
        me.setName_of_lesson(lesson_name);

        Configuration con=new Configuration().configure().addAnnotatedClass(Questions.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(me);
        tx.commit();
    }

    public static void add_question(List<Questions> ibm){
        me= new Questions();

        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson.class);
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        for(Questions  i:ibm){
            me.setQuestion(i.getQuestion());
            me.setOp1(i.getOp1());
            me.setOp2(i.getOp2());
            me.setOp3(i.getOp3());
            me.setOp4(i.getOp4());
            me.setName_of_lesson(i.getName_of_lesson());
            session.save(me);
            me= new Questions();
        }

        tx.commit();
    }


    public static List<Questions> get_question(String name){
        List<Questions> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Questions.class);
        SessionFactory sf= con.buildSessionFactory();
        String b=name;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Questions a where (a.name_of_lesson= :b)");
        q.setParameter("b",b);
        q.addEntity(Questions.class);
        // FIXME: actname is name of that lesson
        fresult=q.list();
        //fresult=fresult.subList(0,fresult.size());
        tx.commit();
        return fresult;
    }
}
