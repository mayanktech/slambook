/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.interfaces;

import com.slambook.entity.VideoLikes;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface VideoLikeServiceInt {
   
    public int addLike(VideoLikes videoLikes);
    public int removeLike(VideoLikes videoLikes);
    public ArrayList getVideoLikes(int videoId);
    public int getVideoLikesCount(int videoId);
    public int returnVideoLikesCount(int videoId);
    public boolean isAlreadyLiked(int videoId,int userId);
}
