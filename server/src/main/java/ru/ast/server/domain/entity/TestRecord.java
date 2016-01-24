package ru.ast.server.domain.entity;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import ru.ast.server.domain.Domain;

import javax.persistence.*;
import java.util.Set;

/**
 * @author Fenix
 */

@Entity
@AutoProperty
public class TestRecord implements Domain {

    private static final long serialVersionUID = -7740774661360528436L;

    @Id
    @Column(name = "RECORD_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long testRecordId;

    @OneToOne(optional = false)
    private Question question;

    @ManyToMany
    @JoinTable(name = "TEST_RECORD_VARIANT",
            joinColumns = {@JoinColumn(name = "RECORD", referencedColumnName = "RECORD_ID")},
            inverseJoinColumns = {@JoinColumn(name = "VARIANT", referencedColumnName = "VARIANT_ID")})
    private Set<Variant> userChoice;


    public Long getTestRecordId() {
        return testRecordId;
    }

    public void setTestRecordId(Long testRecordId) {
        this.testRecordId = testRecordId;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Set<Variant> getUserChoice() {
        return userChoice;
    }

    public void setUserChoice(Set<Variant> userChoice) {
        this.userChoice = userChoice;
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
