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
   
    public long addLike(VideoLikes videoLikes);
    public long removeLike(VideoLikes videoLikes);
    public ArrayList getVideoLikes(long videoId);
    public long getVideoLikesCount(long videoId);
    public long returnVideoLikesCount(long videoId);
    public boolean isAlreadyLiked(long videoId,long userId);
}
