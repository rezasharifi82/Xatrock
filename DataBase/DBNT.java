package com.DataBase;
import com.mysql.cj.Query;
import org.hibernate.*;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DBNT {

    public static void main(String[] args) {
//       //Date me= new Date("2019/10/10");
//        List<Integer> i=new ArrayList<>();
//        i.add(5);
//        i.add(4);
        List<Activity> me;
         me=Member_source.get_member_activity(5);
       //Activity_Source.save_activity(3,"soakdfokas",me,0);
        //System.out.println(Activity_Source.save_activity(7,"reza",me,0));
       // System.out.println(Member_source.find_by_id(3));



    }
}
