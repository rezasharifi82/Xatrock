package xat.DataBase;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Random;

@Entity

@Table(name = "Lesson_page")
public class Lesson_Page {
    //public static final String namez=DBNT.seget_name("sad");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Actid", nullable = false)
    private Integer Actid;

    @Column(name = "type_of_activity", nullable = false)
    private Integer type_of_activity;

    @Column(name = "name_of_activity", nullable = false, length = 45)
    private String name_of_activity;

    @Column(name = "Chat", nullable = true, length = 45)
    private String Chat;

    public Integer getActid() {
        return Actid;
    }

    public Integer getType_of_activity() {
        return type_of_activity;
    }

    public String getName_of_activity() {
        return name_of_activity;
    }

    public String getChat() {
        return Chat;
    }

    public void setActid(Integer actid) {
        Actid = actid;
    }

    public void setType_of_activity(Integer type_of_activity) {
        this.type_of_activity = type_of_activity;
    }

    public void setName_of_activity(String name_of_activity) {
        this.name_of_activity = name_of_activity;
    }

    public void setChat(String chat) {
        Chat = chat;
    }

}