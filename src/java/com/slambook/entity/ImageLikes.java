/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Mayank
 */

@Entity
@NamedQueries({

    @NamedQuery(name="ImageLikes.removeLike",query="DELETE FROM ImageLikes likes WHERE likes.images.imageId = :imageId AND likes.userInfo.userId = :userId")
   /*  @NamedQuery(name="ImageLikes.getImageLikes",query="FROM ImageLikes likes WHERE likes.images.imageId = :imageId"),
     @NamedQuery(name="ImageLikes.getImageLikesCount",query="SELECT COUNT(likes.imageLikeId) FROM ImageLikes likes WHERE likes.images.imageId = :imageId"),
     @NamedQuery(name="ImageLikes.isAlreadyLiked",query="FROM ImageLikes likes WHERE likes.images.imageId = :imageId AND likes.userId = :userId")   */
})
public class ImageLikes implements Serializable {
    
    @Id
    private long imageLikeId;
    
    @ManyToOne
    @JoinColumn(name="imageId")
    private Images images;
   
    @Transient
    private String friendId;
    @Transient
    private String friendName;
    @Transient
    private String currentProfilePic;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserInfo userInfo;
    
    @Transient
    private String albumId;
    
    @Transient
    private String imageId;
    
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

    public long getImageLikeId() {
        return imageLikeId;
    }

    public void setImageLikeId(long imageLikeId) {
        this.imageLikeId = imageLikeId;
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
