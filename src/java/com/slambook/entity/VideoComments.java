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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Mayank
 */

@Entity
@NamedQueries({

    @NamedQuery(name = "VideoComments.getVideoComments",query = "FROM VideoComments comments WHERE comments.videos.videoId = :videoId"),
    @NamedQuery(name = "VideoComments.getVideoCommentsCount",query = "SELECT COUNT(comments.commentId) FROM VideoComments comments WHERE comments.videos.videoId = :videoId")

})
public class VideoComments implements Serializable {
    
    @Id
    private long commentId;
    
    @ManyToOne
    @JoinColumn(name="userId")
    private UserInfo userInfo;
    
    @ManyToOne
    @JoinColumn(name="videoId")
    private Videos videos;

    
    @Transient
    private long currentProfilePicId;
    
    private String commentText;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date commentDate;
    
    @Transient
    private String name;
    @Transient
    private long userId;
    @Transient
    private long videoId;

   
    public long getCommentId() {
        return commentId;
    }

    public void setCommentId(long commentId) {
        this.commentId = commentId;
    }

   
    public long getCurrentProfilePicId() {
        return currentProfilePicId;
    }

    public void setCurrentProfilePicId(long currentProfilePicId) {
        this.currentProfilePicId = currentProfilePicId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Date getDate() {
        return commentDate;
    }

    public void setDate(Date date) {
        this.commentDate = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    
    
    
}
