/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.interfaces;

import com.slambook.entity.ImageLikes;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface ImageLikeServiceInt {
   
     public long addLike(ImageLikes imageLikes);
     public long removeLike(ImageLikes imageLikes);
     public ArrayList getImageLikes(long imageId);
     public long getImageLikesCount(long imageId);
     public long returnImageLikesCount(long imageId);
     public boolean isAlreadyLiked(long imageId,long userId);
   
}
