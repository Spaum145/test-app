package ru.ast.server.domain.entity;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import ru.ast.server.domain.Domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author Fenix
 */
@Entity
@AutoProperty
@Table(name = "USER")
public class User implements Domain {

    private static final long serialVersionUID = 60238700825121064L;

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long userId;

    @Column(name = "NAME", length = 32)
    private String name;

    @Column(name = "LOGIN", length = 20, nullable = false, unique = true)
    private String login;

    @Column(name = "PASSWORD", length = 20, nullable = false)
    private String password;

    @OneToMany(orphanRemoval = true)
    @OrderBy("START_MOMENT DESC")
    private List<Test> passedTests;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Test> getPassedTests() {
        return passedTests;
    }

    public void setPassedTests(List<Test> passedTests) {
        this.passedTests = passedTests;
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
