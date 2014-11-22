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
import javax.persistence.Transient;

/**
 *
 * @author mayank
 */
/*@NamedQueries({

    @NamedQuery(name="AlbumComments.getAlbumComments",query="FROM AlbumComments userAlbumComments WHERE userAlbumComments.images.imageId = :imageId"),
    @NamedQuery(name="AlbumComments.getAlbumCommentsCount",query="SELECT COUNT(userAlbumComments.commentId) FROM AlbumComments userAlbumComments WHERE userAlbumComments.images.imageId = :imageId")
    
})*/
@Entity
public class AlbumComments {
    
    @Id
    private long commentId;
    
    private String commenterId;
    
    @ManyToOne
    @JoinColumn(name="albumId")
    private Album album;
    
    @Transient
    private String currentProfilePicId;
    
    private String commentText;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdOn;
    
    @Transient
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserInfo userInfo;
    
    @Transient
    private String albumId;

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

    public String getCommenterId() {
        return commenterId;
    }

    public void setCommenterId(String commenterId) {
        this.commenterId = commenterId;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getCurrentProfilePicId() {
        return currentProfilePicId;
    }

    public void setCurrentProfilePicId(String currentProfilePicId) {
        this.currentProfilePicId = currentProfilePicId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date date) {
        this.createdOn = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
