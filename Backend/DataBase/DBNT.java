package xat.DataBase;
import xat.API.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBNT {
    public static int position_state;
    Member client_member;
    String name_of_table;


    public static void new_Activity(int member_id,String name_of_lesson,Date deadline,int State){
        Activity_Source.save_activity(member_id,name_of_lesson,deadline,State);}
    public static void new_Activity(List<Integer> list_of_Students,String name,Date deadline,int state){
        Activity_Source.save_activity(list_of_Students,name,deadline,state);}
    public static void new_Exam(int member_id,String name,String time){
        Exam_source.save_exam(member_id,name,time);}
    public static void new_Exam(List<Integer> member_id,String name,String Time){
        Exam_source.save_exam(member_id,name,Time);}
    public static void new_Lesson(String name){Lesson_source.new_Lesson(name);}
    public static void new_member_add_to_Lesson(List<Integer> member_id,String name){
        Lesson_source.new_Lesson(member_id,name);}
    public static void new_member_add_to_Lesson(String name,int member_id){
        Lesson_source.new_Lesson(member_id,name);}
    public static void new_Member(String Name,String Email,int ha,int dead,String Mobile,String Pass,String po, String Last){
        Member_source.add_member(Name,Email,ha,dead,Mobile,Pass,po,Last);
    }
    public static void new_Member(Member i){
        Member_source.add_member(i);}
    public static List<Activity> get_list_member_activity(int memberid){
        return Member_source.get_member_activity(memberid);}
    public static List<Lesson_Page> get_list_member_exam(int memberid){
        return Member_source.get_member_exam(memberid);}
    public static List<Lesson> get_member_lesson(int memberid){
        return Member_source.get_member_Lesson(memberid);}
    public static Object[] Login_Qualification(String Email,String Pass){
        Object[] temp=new Object[2];
        Pass=AES.encrypt(Pass);
        int finall=-1;
        Member result;
        try {
            result=Member_source.find_by_email(Email);
            temp[1]=result;
            if(result.getEmail().equals(Email) && result.getPassword().equals(Pass)){
                temp[0]= 1;

                return temp;
            }
            else{
                temp[0]= -1;
                temp[1]=null;

                return temp;
            }
        }
        catch (Exception e){
            System.out.println("Object Not Found in DataBase!");
        }

        return temp;


    } //first return 1 if qualified seconf return member obj or not
    public static int Check_position(Member i){
        int po=0;
        if(i.getPosition().equalsIgnoreCase("Student")){
            po=0;
        }
        else if (i.getPosition().equalsIgnoreCase("Teacher")){
            po=1;

        }
        return po;

    }
    public static Member find_by_email(String Email){return Member_source.find_by_email(Email);}
    public static Member member_lost(int i){
        return Member_source.find_by_id(i);}
    public static List<Member> get_list_member_of_lesson(String name){return Member_source.get_members_of_lesson(name);}
    public static List<Exam> get_list_exam_of_lesson(String name_of_lesson){return Member_source.get_exam_of_lesson(name_of_lesson);}
    public static List<Activity> get_list_Activity_lesson(String name_of_lesson){return Member_source.get_Activity_of_lesson(name_of_lesson);}
    public static List<Member> get_not_subscribed_student_list(String name_of_lesson){return Member_source.not_member_students(name_of_lesson);}
    public static List<Questions> get_questions_of_exam(String name_of_lesson){return Question_Source.get_question(name_of_lesson);}
    public static void save_new_question(String Question ,String op1,String op2 , String op3 , String op4,String lesson_name){Question_Source.add_question(Question,op1,op2,op3,op4,lesson_name);}
    public static void save_new_question(List<Questions> ibm){Question_Source.add_question(ibm);}
    public static void import_by_excel(String path){Excelcheck.well(path);}
    public static void forget_Password(String email,String new_Password){Member_source.pass_change(email,new_Password);}
    public static void export_question_as_pdf(List<Questions> list_of_questions){PDFGT.pdfgen(list_of_questions);}
    public static void export_question_as_pdf(String name_of_lesson){PDFGT.pdfgen(name_of_lesson);}









































    public static void main(String[] args) {
//       //Date me= new Date("2019/10/10");
//        List<Integer> i=new ArrayList<>();
//        i.add(5);
//        i.add(4);
        //List<Activity> me;
        //Member me;
         //me=Member_source.find_by_email("shar");
        //System.out.println(Member_Qualification("sharifi@gmail.com","123456")[1]);
        //Email.send("sharifi.mohammadreza2002@gmail.com","code","asdasd");


       //Activity_Source.save_activity(3,"soakdfokas",me,0);
        //System.out.println(Activity_Source.save_activity(7,"reza",me,0));
       // System.out.println(Member_source.find_by_id(3));



    }


}
