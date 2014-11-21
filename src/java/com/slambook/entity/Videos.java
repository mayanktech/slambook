/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

/**
 *
 * @author Mayank
 */
@Entity
@NamedQueries({

     @NamedQuery(name = "Videos.getVideos",query = "FROM Videos userVideos WHERE userVideos.userInfo.userId = :userId ORDER BY userVideos.videoId DESC"),
     @NamedQuery(name = "Videos.getYoutubeVideoCode",query = "SELECT userVideos.videoUrl FROM Videos userVideos WHERE userVideos.videoId = :videoId"),
     @NamedQuery(name = "Videos.getYoutubeVideoDescription",query = "SELECT userVideos.videoDescription FROM Videos userVideos WHERE userVideos.videoId = :videoId")

})
public class Videos implements Serializable {
    
    
    
    @Id
    private long videoId;
    
    @ManyToOne
    @JoinColumn(name="userId")
    private UserInfo userInfo;
    
    String videoUrl;
    String videoDescription;
    
    @Transient
    private int videoLikesCount;
    @Transient
    private int videoCommentsCount;
    @Transient
    private Boolean alreadyLiked;
    
    @OneToMany(mappedBy="videos")
    private List <com.slambook.entity.VideoComments>videoComments;
    
    @OneToMany(mappedBy="videos")
    private List <com.slambook.entity.VideoLikes>videoLikes;
    
     
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
    
    

    public long getVideoId() {
        return videoId;
    }

    public void setVideoId(long videoId) {
        this.videoId = videoId;
    }

    public String getVideoDescription() {
        return videoDescription;
    }

    public void setVideoDescription(String videoDescription) {
        this.videoDescription = videoDescription;
    }

    public int getVideoLikesCount() {
        return videoLikesCount;
    }

    public void setVideoLikesCount(int videoLikesCount) {
        this.videoLikesCount = videoLikesCount;
    }

    public Boolean getAlreadyLiked() {
        return alreadyLiked;
    }

    public void setAlreadyLiked(Boolean alreadyLiked) {
        this.alreadyLiked = alreadyLiked;
    }

    public int getVideoCommentsCount() {
        return videoCommentsCount;
    }

    public void setVideoCommentsCount(int videoCommentsCount) {
        this.videoCommentsCount = videoCommentsCount;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public List <com.slambook.entity.VideoComments> getVideoComments() {
        return videoComments;
    }

    public void setVideoComments(List <com.slambook.entity.VideoComments> videoComments) {
        this.videoComments = videoComments;
    }

    public List <com.slambook.entity.VideoLikes> getVideoLikes() {
        return videoLikes;
    }

    public void setVideoLikes(List <com.slambook.entity.VideoLikes> videoLikes) {
        this.videoLikes = videoLikes;
    }

    
}
