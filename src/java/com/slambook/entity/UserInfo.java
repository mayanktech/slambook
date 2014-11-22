/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Mayank
 */
@Entity
@NamedQueries({

@NamedQuery(name="Friends.searchFriendsByName",query="SELECT user.userId,user.firstName,user.lastName from UserInfo user where CONCAT(user.firstName,user.lastName) LIKE (:searchString)"),
@NamedQuery(name="Friends.searchFriendsByEmail",query="SELECT user.userId,user.firstName,user.lastName from UserInfo user where user.email = :email"),
@NamedQuery(name="UserInfo.getEmailById",query="SELECT user.email from UserInfo user where user.userId = :userId"),
@NamedQuery(name="UserInfo.checkEmail",query="SELECT user.email from UserInfo user where user.email LIKE :email"),
@NamedQuery(name="UserInfo.getUserIdByEmail",query="SELECT user.userId from UserInfo user where user.email = :email"),
@NamedQuery(name="UserInfo.getUserByEmail",query="From UserInfo user where user.email = :email"),
@NamedQuery(name="UserInfo.getUserInfoById",query="SELECT user.userId,user.accountStatus,user.birthday,user.braggingRights,user.college,user.email,user.firstName,user.gender,user.introduction,user.lastSessionDestroyedTime,user.lookingFor,user.occupation,user.password,user.placesLived,user.relationshipStatus,user.school,user.tagline,user.website from UserInfo user where user.userId = :userId"),
@NamedQuery(name="UserInfo.updateUserInfo",query="UPDATE UserInfo user SET user.tagline=:tagline , user.introduction=:introduction ,user.braggingRights=:braggingRights , user.placesLived=:placesLived , user.lookingFor=:lookingFor , user.birthday=:birthday , user.email=:email , user.relationshipStatus=:relationshipStatus , user.school=:school , user.college=:college , user.website=:website")

})


public class UserInfo implements  Serializable {
    
    @Id
    private long userId;
    
    private String userinfoRandomstring;
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    private String birthday;
    private String school;
    private String college;
    private String relationshipStatus;
    private String occupation;
    private String website;
    private String tagline;
    private String introduction;
    private String braggingRights;
    private String placesLived;
    private String lookingFor;
    private String accountStatus;
    private String verificationKey;
    
    
    @Transient
    private long currentProfilePic;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date lastSessionDestroyedTime;

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    
     @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    @OneToMany(mappedBy = "userInfo")
    private List <com.slambook.entity.Slambook> slambookList;
    
    @OneToMany(mappedBy = "friendInfo")
    private List <com.slambook.entity.Answers> answersList;
    
    @OneToMany(mappedBy="userInfo")
    private List <com.slambook.entity.Album> albumList;
    
    @OneToMany(mappedBy = "userInfo")
    private List <com.slambook.entity.Images> imagesList;
    
    @OneToMany(mappedBy = "userInfo")
    private List <com.slambook.entity.ImageComments> imageCommentsList;
    
    @OneToMany(mappedBy = "userInfo")
    private List <com.slambook.entity.ImageLikes> imageLikesList;
    
    @OneToMany(mappedBy = "userInfo")
    private List<com.slambook.entity.Friends> friendsList;
    
    @OneToMany(mappedBy = "userInfo")
    private List<com.slambook.entity.Videos> videosList;
    
    @OneToMany(mappedBy = "userInfo")
    private List<com.slambook.entity.VideoLikes> videoLikesList;
    
    @OneToMany(mappedBy = "userInfo")
    private List<com.slambook.entity.VideoComments> videoCommentsList;
    
    @OneToMany(mappedBy = "userInfo")
    private List<com.slambook.entity.ProfilePic> profilePicList;
    
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
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

    public String getEmail() {
        return email;
    }
    

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getBraggingRights() {
        return braggingRights;
    }

    public void setBraggingRights(String braggingRights) {
        this.braggingRights = braggingRights;
    }

    public String getPlacesLived() {
        return placesLived;
    }

    public void setPlacesLived(String placesLived) {
        this.placesLived = placesLived;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getVerificationKey() {
        return verificationKey;
    }

    public void setVerificationKey(String verificationKey) {
        this.verificationKey = verificationKey;
    }

    public Date getLastSessionDestroyedTime() {
        return lastSessionDestroyedTime;
    }

    public void setLastSessionDestroyedTime(Date lastSessionDestroyedTime) {
        this.lastSessionDestroyedTime = lastSessionDestroyedTime;
    }

    public long getCurrentProfilePic() {
        return currentProfilePic;
    }

    public void setProfilePic(long currentProfilePic ) {
        this.currentProfilePic = currentProfilePic;
    }

    public List <com.slambook.entity.Slambook> getSlambookList() {
        return slambookList;
    }

    public void setSlambookList(List <com.slambook.entity.Slambook> slambookList) {
        this.slambookList = slambookList;
    }

    public List <com.slambook.entity.Answers> getAnswersList() {
        return answersList;
    }

    public void setAnswersList(List <com.slambook.entity.Answers> answersList) {
        this.answersList = answersList;
    }

    public List <com.slambook.entity.Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List <com.slambook.entity.Album> albumList) {
        this.albumList = albumList;
    }

    public List<Images> getImagesList() {
        return imagesList;
    }

    public void setImagesList(List<Images> imagesList) {
        this.imagesList = imagesList;
    }

    public List<ImageComments> getImageCommentsList() {
        return imageCommentsList;
    }

    public void setImageCommentsList(List<ImageComments> imageCommentsList) {
        this.imageCommentsList = imageCommentsList;
    }

    public List<ImageLikes> getImageLikesList() {
        return imageLikesList;
    }

    public void setImageLikesList(List<ImageLikes> imageLikesList) {
        this.imageLikesList = imageLikesList;
    }

    public List<Friends> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<Friends> friendsList) {
        this.friendsList = friendsList;
    }

    public List<Videos> getVideosList() {
        return videosList;
    }

    public void setVideosList(List<Videos> videosList) {
        this.videosList = videosList;
    }

    public List<VideoLikes> getVideoLikesList() {
        return videoLikesList;
    }

    public void setVideoLikesList(List<VideoLikes> videoLikesList) {
        this.videoLikesList = videoLikesList;
    }

    public List<VideoComments> getVideoCommentsList() {
        return videoCommentsList;
    }

    public void setVideoCommentsList(List<VideoComments> videoCommentsList) {
        this.videoCommentsList = videoCommentsList;
    }

    public List<ProfilePic> getProfilePicList() {
        return profilePicList;
    }

    public void setProfilePicList(List<ProfilePic> profilePicList) {
        this.profilePicList = profilePicList;
    }

    public String getUserinfoRandomstring() {
        return userinfoRandomstring;
    }

    public void setUserinfoRandomstring(String userinfoRandomstring) {
        this.userinfoRandomstring = userinfoRandomstring;
    }

    
    
    

}
