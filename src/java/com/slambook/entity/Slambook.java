/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Mayank
 */
@Entity
public class Slambook implements Serializable {
    
    @Id
    private long slambookId;
   
    @ManyToOne
    @JoinColumn(name="userId")
    private UserInfo userInfo;
    
    private String slambookName;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date slambookCreationDate;
    
    @Transient
    private int numberOfFriends;
    
    @OneToMany(cascade = {CascadeType.ALL}, mappedBy = "slambook")
    private List<com.slambook.entity.Questions> slambookQuestions;
    
    @OneToMany(mappedBy = "slambook")
    private List<com.slambook.entity.Friends> friendsList;

    public long getSlambookId() {
        return slambookId;
    }

    public void setSlambookId(long slambookId) {
        this.slambookId = slambookId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getSlambookName() {
        return slambookName;
    }

    public void setSlambookName(String slambookName) {
        this.slambookName = slambookName;
    }

    public Date getSlambookCreationDate() {
        return slambookCreationDate;
    }

    public void setSlambookCreationDate(Date slambookCreationDate) {
        this.slambookCreationDate = slambookCreationDate;
    }

    

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public List<com.slambook.entity.Questions> getSlambookQuestions() {
        return slambookQuestions;
    }

    public void setSlambookQuestions(List<com.slambook.entity.Questions> slambookQuestions) {
        this.slambookQuestions = slambookQuestions;
    }

    public List<com.slambook.entity.Friends> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<com.slambook.entity.Friends> friendsList) {
        this.friendsList = friendsList;
    }
    
    
    
}
