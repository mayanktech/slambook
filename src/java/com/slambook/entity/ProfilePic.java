/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Mayank
 */
@Entity
public class ProfilePic implements Serializable {
    
    @Id
    private long profilePicId;
    
    private String profilePicRandomString;
    
    @ManyToOne
    @JoinColumn(name="userId")
    private UserInfo userInfo;
    
    @Transient
    private MultipartFile imagefile;
    
    public long getProfilePicId() {
        return profilePicId;
    }

    public void setProfilePicId(long profilePicId) {
        this.profilePicId = profilePicId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public MultipartFile getImagefile() {
        return imagefile;
    }

    public void setImagefile(MultipartFile imagefile) {
        this.imagefile = imagefile;
    }

    public String getProfilePicRandomString() {
        return profilePicRandomString;
    }

    public void setProfilePicRandomString(String profilePicRandomString) {
        this.profilePicRandomString = profilePicRandomString;
    }
    
    
    
    
}
