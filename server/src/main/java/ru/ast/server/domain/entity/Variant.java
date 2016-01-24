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
@Table(name = "VARIANT")
public class Variant implements Domain{

    private static final long serialVersionUID = -8444063351369658091L;

    @Id
    @Column(name = "VARIANT_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long variantId;

    @Column(name = "CONTENT", nullable = false)
    private String content;

    @Column(name = "IS_CORRECT")
    private Boolean isCorrect = Boolean.FALSE;


    public Long getVariantId() {
        return variantId;
    }

    public void setVariantId(Long variantId) {
        this.variantId = variantId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getCorrect() {
        return isCorrect;
    }

    public void setCorrect(Boolean correct) {
        isCorrect = correct;
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
