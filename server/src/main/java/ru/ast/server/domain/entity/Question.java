package ru.ast.server.domain.entity;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import ru.ast.server.domain.Domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Fenix
 */
@Entity
@AutoProperty
public class Question implements Domain {

    private static final long serialVersionUID = -5714081079477759933L;

    @Id
    @Column(name = "QUESTION_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long questionId;

    @Column(name = "CONTENT", nullable = false)
    private String content;

//    private Category
//    private Type


    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object o) {
        return Pojomatic.equals(this, o);
    }

    @Override
    public int hashCode() {
        return Pojomatic.hashCode(this);
    }

    @Override
    public String toString() {
        return Pojomatic.toString(this);
    }
}
