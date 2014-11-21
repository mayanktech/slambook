/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 *
 * @author Mayank
 */
@Entity
@NamedQueries({

    @NamedQuery(name = "Slambook.getQuestions",query = "from Questions questions where questions.slambook.slambookId = :slambookId")
        
})
public class Questions implements Serializable {
    
    
    @Id
    private long questionId;
    
    
    private String question;
    
    @ManyToOne
    @JoinColumn(name="slambookId")
    private Slambook slambook;
    
    

    public Questions(String question, Slambook slambook) {
        this.question = question;
        this.slambook = slambook;
    }

    public Questions() {
    }
    
    

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Slambook getSlambook() {
        return slambook;
    }

    public void setSlambook(Slambook slambook) {
        this.slambook = slambook;
    }

  
    
    
}
