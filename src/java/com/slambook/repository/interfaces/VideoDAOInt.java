/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

import com.slambook.entity.Videos;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface VideoDAOInt {
    
     public ArrayList getVideos(long userId,long clickTimes);
     public long addVideo(Videos video);
     public void updateVideo(Videos video);
     public long deleteVideo(long videoId);
     public String getYoutubeVideoId(String youtubeUrl);
     public String getYoutubeVideoCode(long videoId);
     public String getVideoDescription(long videoId);
    
}
