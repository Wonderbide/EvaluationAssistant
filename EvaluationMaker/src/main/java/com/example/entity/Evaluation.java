package com.example.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Evaluation {
    private String title;
    @Id
    private long evaluationID;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "MAP_QUESTION_EVALUATION",
            joinColumns = @JoinColumn(name = "EVALUATION_ID"),
            inverseJoinColumns = @JoinColumn(name = "QUESTION_ID")
    )
    private Set<Question> listOfQuestion;

    public Evaluation() {}

    public Evaluation(String title, long evaluationID, Set<Question> listOfQuestion) {
        this.title = title;
        this.evaluationID = evaluationID;
        this.listOfQuestion = listOfQuestion;
    }

    public Set<Question> getListOfQuestion() {
        return listOfQuestion;
    }

    public void setListOfQuestion(Set<Question> listOfQuestion) {
        this.listOfQuestion = listOfQuestion;
    }

    public Evaluation(String title, long evaluationID) {
        this.title = title;
        this.evaluationID = evaluationID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getEvaluationID() {
        return evaluationID;
    }

    public void setEvaluationID(long evaluationID) {
        this.evaluationID = evaluationID;
    }
}
