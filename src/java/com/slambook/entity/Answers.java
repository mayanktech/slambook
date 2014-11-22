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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * @author Mayank
 */
@Entity
@NamedQueries({

        @NamedQuery(name = "Answers.getAnswer",query = "FROM Answers answers where answers.questionId = :questionId AND answers.friendInfo.userId = :friendId ")

})
public class Answers implements Serializable {
    
    @Id
    private long answerId;
    
    private String answer;
    
    private long questionId;
    
    private long slambookId;
   
    @ManyToOne
    @JoinColumn(name = "friendId")
    private UserInfo friendInfo;
    
    public long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(long answerId) {
        this.answerId = answerId;
    }

    
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    public UserInfo getFriendInfo() {
        return friendInfo;
    }

    public void setFriendInfo(UserInfo friendInfo) {
        this.friendInfo = friendInfo;
    }

    public long getSlambookId() {
        return slambookId;
    }

    public void setSlambookId(long slambookId) {
        this.slambookId = slambookId;
    }
  
    

    
    
}
