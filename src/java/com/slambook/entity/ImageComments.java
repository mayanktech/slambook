/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Mayank
 */
@Entity
/*@NamedQueries({

    @NamedQuery(name="ImageComments.getImageComments",query="FROM ImageComments userImageComments WHERE userImageComments.images.imageId = :imageId"),
    @NamedQuery(name="ImageComments.getImageCommentsCount",query="SELECT COUNT(userImageComments.commentId) FROM ImageComments userImageComments WHERE userImageComments.images.imageId = :imageId")
    
})*/
public class ImageComments implements Serializable {
    
    @Id
    private long commentId;
    
    private String commenterId;
    
    @ManyToOne
    @JoinColumn(name="imageId")
    private Images images;
    
    @Transient
    private String currentProfilePicId;
    
    private String commentText;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @Transient
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserInfo userInfo;
    
    @Transient
    private String albumId;
    
    @Transient
    private String imageId;

    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCommenterId() {
        return commenterId;
    }

    public void setCommenterId(String commenterId) {
        this.commenterId = commenterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
    
    
}
