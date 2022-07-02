package xat.DataBase;

import com.mysql.cj.util.StringUtils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import java.util.List;
import java.math.BigInteger;
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
        Pass=AES.encrypt(Pass);
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

    public static List<Lesson_Page> get_member_exam(int memberid){
        List<Lesson_Page> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class).addAnnotatedClass(Lesson_Page.class);
        SessionFactory sf= con.buildSessionFactory();
        int b=memberid;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Exam a  join Members m on (a.memberid= :b)");
        q.setParameter("b",b);
        q.addEntity(Lesson_Page.class);

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
    public static Member find_by_email(String i) throws ObjectNotFoundException{
        List<Member> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class);

        SessionFactory sf= con.buildSessionFactory();
        String b=i;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select m.* From Members m Where (m.email= :b)");
        q.setParameter("b",b);
        q.addEntity(Member.class);


        fresult=q.list();
        //fresult=fresult.subList(0,fresult.size()/2);
        if(fresult.size()==0){
            //return null;
            throw new ObjectNotFoundException();
        }
        else {
            Member me = fresult.get(0);
            int j = me.getId();
            me = (Member) session.get(Member.class, j);


            tx.commit();
            return me;
        }
    }

    public static List<Member> get_members_of_lesson(String name){
        List<Member> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class).addAnnotatedClass(Lesson.class);
        SessionFactory sf= con.buildSessionFactory();
        String b=name;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select m.* From Lesson a  join Members m on (a.name= :b AND a.mid=m.memberid )");
        q.setParameter("b",b);
        q.addEntity(Lesson.class);

        fresult=q.list();
        //fresult=fresult.subList(0,fresult.size());

        tx.commit();
        return fresult;
    }



    public static List<Exam> get_exam_of_lesson(String name){
        List<Exam> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Exam.class).addAnnotatedClass(Lesson.class);
        SessionFactory sf= con.buildSessionFactory();
        String b=name;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Exam a where (a.name= :b)");
        q.setParameter("b",b);
        q.addEntity(Exam.class);

        fresult=q.list();
        //fresult=fresult.subList(0,fresult.size());

        tx.commit();
        return fresult;

    }

    public static List<Activity> get_Activity_of_lesson(String name){
        List<Activity> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Activity.class);
        SessionFactory sf= con.buildSessionFactory();
        String b=name;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select a.* From Activity a where (a.name= :b)");
        q.setParameter("b",b);
        q.addEntity(Activity.class);
        // FIXME: actname is name of that lesson
        fresult=q.list();
        //fresult=fresult.subList(0,fresult.size());

        tx.commit();
        return fresult;

    }


    public static List<Member> not_member_students(String name){
        List<Member> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Lesson.class).addAnnotatedClass(Member.class);
        SessionFactory sf= con.buildSessionFactory();
        String b=name;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("select m.* From Members m where m.memberid not in (select m.mid From Lesson m where m.name=:b ) and m.position=\"Student\"");
        q.setParameter("b",b);
        q.addEntity(Member.class);
        // FIXME: actname is name of that lesson
        fresult=q.list();
        //fresult=fresult.subList(0,fresult.size());

        tx.commit();
        return fresult;

    }
        //me=(Member)session.get(Member.class,);
        //System.out.println(me);


    public static long last_member_id(){
        List<Long> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class);
        SessionFactory sf= con.buildSessionFactory();
        //String b=name;
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        //NativeQuery q=session.createNativeQuery("SELECT last_insert_id() FROM Members limit 1");
        Long lastid=((long) session.createNativeQuery("SELECT last_insert_id() ").uniqueResult());
        //q.setParameter("b",b);
        //q.addEntity(Long.class);
        System.out.println(lastid);
        //fresult=q.list();
       // System.out.println(q.list());
        //fresult=fresult.subList(0,fresult.size());

        tx.commit();
        return lastid;

    }


    public static void pass_change(String email, String new_pass){
       // List<Member> fresult;
        Configuration con=new Configuration().configure().addAnnotatedClass(Member.class);
        SessionFactory sf= con.buildSessionFactory();
        String b=email;
        String a=new_pass;
        Member t=DBNT.find_by_email(b);
        //System.out.println(t);
        int f=t.getId();
        Session session = sf.openSession();
        Transaction tx=session.beginTransaction();
        NativeQuery q=session.createNativeQuery("UPDATE Members SET Password = :a WHERE (`memberid` = :f)");
        q.setParameter("f",f);
        q.setParameter("a",a);
        q.addEntity(Member.class);
        q.executeUpdate();

        //fresult=q.list();
        //fresult=fresult.subList(0,fresult.size());

        tx.commit();

        //return fresult;

    }

    public static void main(String[] args) {
        System.out.println( last_member_id());
    }


}
