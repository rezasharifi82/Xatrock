package xat.DataBase;

import jakarta.persistence.*;

@Entity
@Table(name = "Questions")

public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "Question", nullable = false ,length = 45)
    private String Question;

    @Column(name = "op1", nullable = true, length = 45)
    private String op1;
    @Column(name = "op2", nullable = true, length = 45)
    private String op2;
    @Column(name = "op3", nullable = true, length = 45)
    private String op3;
    @Column(name = "op4", nullable = true, length = 45)
    private String op4;
    @Column(name = "name_of_lesson", nullable = true, length = 45)
    private String name_of_lesson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(String op1) {
        this.op1 = op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(String op2) {
        this.op2 = op2;
    }

    public String getOp3() {
        return op3;
    }

    public void setOp3(String op3) {
        this.op3 = op3;
    }

    public String getOp4() {
        return op4;
    }

    public void setOp4(String op4) {
        this.op4 = op4;
    }

    public String getName_of_lesson() {
        return name_of_lesson;
    }

    public void setName_of_lesson(String name_of_lesson) {
        this.name_of_lesson = name_of_lesson;
    }
}