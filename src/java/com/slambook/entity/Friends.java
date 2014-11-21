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
import javax.persistence.Transient;

/**
 *
 * @author Mayank
 */

@Entity
public class Friends implements Serializable {
    
    @Id
    private long connectionId;
    
    private String friendRandomString;
   
    private String friendId;
    
    @ManyToOne
    @JoinColumn(name="userId")
    private UserInfo userInfo;
    
    @ManyToOne
    @JoinColumn(name="slambookId")
    private Slambook  slambook;
    
    private String connectionStatus;
    
    @Transient
    private UserInfo friendInfo;
    
    @Transient
    String firstName;
    
    @Transient
    String lastName;
    
    @Transient
    String profilePicId;
    
    @Transient
    private int numberOfMutualFriends;
    
    @Transient
    private boolean alreadyFriend;

    
    public String getProfilePicId() {
        return profilePicId;
    }

    public void setProfilePicId(String profilePicId) {
        this.profilePicId = profilePicId;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    public boolean isAlreadyFriend() {
        return alreadyFriend;
    }

    public void setAlreadyFriend(boolean alreadyFriend) {
        this.alreadyFriend = alreadyFriend;
    }

    public int getNumberOfMutualFriends() {
        return numberOfMutualFriends;
    }

    public void setNumberOfMutualFriends(int numberOfMutualFriends) {
        this.numberOfMutualFriends = numberOfMutualFriends;
    }

    public long getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(long connectionId) {
        this.connectionId = connectionId;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public UserInfo getFriendInfo() {
        return friendInfo;
    }

    public void setFriendInfo(UserInfo friendInfo) {
        this.friendInfo = friendInfo;
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(String connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    public Slambook getSlambook() {
        return slambook;
    }

    public void setSlambook(Slambook slambook) {
        this.slambook = slambook;
    }

    public String getFriendRandomString() {
        return friendRandomString;
    }

    public void setFriendRandomString(String friendRandomString) {
        this.friendRandomString = friendRandomString;
    }

   
}
