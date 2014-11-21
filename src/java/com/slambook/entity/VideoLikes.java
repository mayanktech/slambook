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
import javax.persistence.Transient;

/**
 *
 * @author Mayank
 */

@Entity
@NamedQueries({

    @NamedQuery(name = "VideoLikes.getVideoLikes",query = "FROM VideoLikes likes WHERE likes.videos.videoId = :videoId"),
    @NamedQuery(name = "VideoLikes.getVideoLikesCount",query = "SELECT COUNT(likes.videoLikeId) FROM VideoLikes likes WHERE likes.videos.videoId = :videoId"),
    @NamedQuery(name = "VideoLikes.isAlreadyLiked",query = "FROM VideoLikes likes WHERE likes.videos.videoId = :videoId AND likes.userInfo.userId = :userId")

})
public class VideoLikes implements Serializable {
  
    @Id
    private long videoLikeId;
    
    @ManyToOne
    @JoinColumn(name="videoId")
    private Videos videos;

    
    @Transient
    private long friendId;
    
    @Transient
    private String friendName;
    
    @Transient
    private long currentProfilePic;
    
    
    @ManyToOne
    @JoinColumn(name="userId")
    private UserInfo userInfo;
    
    @Transient
    private long videoId;
   
    public long getFriendId() {
        return friendId;
    }

    public void setFriendId(long friendId) {
        this.friendId = friendId;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public long getCurrentProfilePic() {
        return currentProfilePic;
    }

    public void setCurrentProfilePic(long currentProfilePic) {
        this.currentProfilePic = currentProfilePic;
    }

    public long getVideoLikeId() {
        return videoLikeId;
    }

    public void setVideoLikeId(long videoLikeId) {
        this.videoLikeId = videoLikeId;
    }

   

    public Videos getVideos() {
        return videos;
    }

    public void setVideos(Videos videos) {
        this.videos = videos;
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
