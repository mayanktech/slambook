/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author mayank
 */
@Entity
public class AlbumLikes {
    
    @Id
    private long albumLikeId;
    
    @ManyToOne
    @JoinColumn(name="albumId")
    private Album album;
   
    @Transient
    private String friendId;
    @Transient
    private String friendName;
    @Transient
    private String currentProfilePic;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserInfo userInfo;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    
    @Transient
    private String albumId;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public long getAlbumLikeId() {
        return albumLikeId;
    }

    public void setAlbumLikeId(long albumLikeId) {
        this.albumLikeId = albumLikeId;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getFriendId() {
        return friendId;
    }

    public void setFriendId(String friendId) {
        this.friendId = friendId;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getCurrentProfilePic() {
        return currentProfilePic;
    }

    public void setCurrentProfilePic(String currentProfilePic) {
        this.currentProfilePic = currentProfilePic;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }
    
    
   
    

}
