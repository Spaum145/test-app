package ru.ast.server.domain.entity;

import org.joda.time.DateTime;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import ru.ast.server.domain.Domain;

import javax.persistence.*;
import java.util.List;

/**
 * @author Fenix
 */

@Entity
@AutoProperty
@Table(name = "TEST")
public class Test implements Domain {

    private static final long serialVersionUID = 6606309841844383512L;

    @Id
    @Column(name = "TEST_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long testId;

    @Column(name = "START_MOMENT")
    private DateTime startMoment;

    @Column(name = "FINISH_MOMENT")
    private DateTime finishMoment;

    @OneToMany(orphanRemoval = true)
    @OrderColumn(name = "INDEX")
    private List<TestRecord> testRecords;

//    @ManyToOne(optional = false)
//    private User ownerUser;


    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public DateTime getStartMoment() {
        return startMoment;
    }

    public void setStartMoment(DateTime startMoment) {
        this.startMoment = startMoment;
    }

    public DateTime getFinishMoment() {
        return finishMoment;
    }

    public void setFinishMoment(DateTime finishMoment) {
        this.finishMoment = finishMoment;
    }

    public List<TestRecord> getTestRecords() {
        return testRecords;
    }

    public void setTestRecords(List<TestRecord> testRecords) {
        this.testRecords = testRecords;
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
