/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Mayank
 */
@Entity
/*@NamedQueries({

    @NamedQuery(name="Album.getAlbumCoverImage",query="SELECT userImages.imageId FROM Images userImages WHERE userImages.album.albumId = :albumId ORDER BY userImages.imageId DESC LIMIT 1"),
    @NamedQuery(name="Images.getImages",query="FROM Images userImages WHERE userImages.album.albumId = :albumId"),
    @NamedQuery(name="Images.getImageAlbumId",query="SELECT userImages.album.albumId FROM Images userImages WHERE userImages.imageId = :imageId"),
    @NamedQuery(name="Album.getAlbumImageCount",query="SELECT COUNT(userImages.imageId) AS imageCount FROM Images userImages WHERE userImages.album.albumId = :albumId")
        
})*/

public class Images implements Serializable {
    
    
    @Id
    private  long imageId;
    
    private String imageRandomString;
    
    @ManyToOne
    @JoinColumn(name="albumId")
    private Album album;
    
    @Transient
    private int imageLikesCount;
   
    @Transient
    private Boolean alreadyLiked;
    
    @Transient
    private int imageCommentCount;
    
    
    String imageDescription;
    
    @OneToMany(mappedBy="images")
    private List <com.slambook.entity.ImageComments>imageComments;
    
    @OneToMany(mappedBy="images")
    private List <com.slambook.entity.ImageLikes>imageLikes;

    @Transient
    private List <MultipartFile> upload;
    
    @Transient
    private long albumId;
    
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserInfo userInfo;
    
    
    public String getImageDescription() {
        return imageDescription;
    }

    public void setImageDescription(String imageDescription) {
        this.imageDescription = imageDescription;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public int getImageCommentCount() {
        return imageCommentCount;
    }

    public void setImageCommentCount(int imageCommentCount) {
        this.imageCommentCount = imageCommentCount;
    }

    public int getImageLikesCount() {
        return imageLikesCount;
    }

    public void setImageLikesCount(int imageLikesCount) {
        this.imageLikesCount = imageLikesCount;
    }

    public Boolean getAlreadyLiked() {
        return alreadyLiked;
    }

    public void setAlreadyLiked(Boolean alreadyLiked) {
        this.alreadyLiked = alreadyLiked;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public List <com.slambook.entity.ImageComments> getImageComments() {
        return imageComments;
    }

    public void setImageComments(List <com.slambook.entity.ImageComments> imageComments) {
        this.imageComments = imageComments;
    }

    public List <com.slambook.entity.ImageLikes> getImageLikes() {
        return imageLikes;
    }

    public void setImageLikes(List <com.slambook.entity.ImageLikes> imageLikes) {
        this.imageLikes = imageLikes;
    }

    public List<MultipartFile> getupload() {
        return upload;
    }

    public void setupload(List<MultipartFile> upload) {
        this.upload = upload;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public List <MultipartFile> getUpload() {
        return upload;
    }

    public void setUpload(List <MultipartFile> upload) {
        this.upload = upload;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public String getImageRandomString() {
        return imageRandomString;
    }

    public void setImageRandomString(String imageRandomString) {
        this.imageRandomString = imageRandomString;
    }

    
    
    
}
