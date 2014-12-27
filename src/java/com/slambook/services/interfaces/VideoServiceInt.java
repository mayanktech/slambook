/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.interfaces;

import com.slambook.entity.Videos;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface VideoServiceInt {
    public ArrayList getVideos(long userId,int clickTimes);
     public long addVideo(Videos video);
     public void updateVideo(Videos video);
     public long deleteVideo(long videoId);
     public String getYoutubeVideoId(String youtubeUrl);
     public String getYoutubeVideoCode(long videoId);
     public String getVideoDescription(long videoId);
     
}
