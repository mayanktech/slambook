/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

import com.slambook.entity.VideoComments;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface VideoCommentDAOInt {
  
    public void addVideoComments(VideoComments videoComments);
    public ArrayList getVideoComments(long videoId);
    public long getVideoCommentsCount(long videoId);
    
    
}
