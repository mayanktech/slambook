/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.Videos;
import com.slambook.repository.interfaces.VideoDAOInt;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mayank
 */
@Repository
public class VideoDAOImpl implements VideoDAOInt{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public ArrayList getVideos(long userId, long clickTimes) {
       
    int start = 0;
    int end = 0;
    
    if(clickTimes == 0){
    
    start = 0;
    end = 4;
    
    }
    else {
    
    start = (int)(4 * clickTimes);
    end = 4;
    
    }
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Videos.getVideos");
        query.setLong("userId",userId);
        query.setFirstResult(start);
        query.setMaxResults(end);
        return (ArrayList) query.list();
    }

    @Override
    public long addVideo(Videos video) {
        
        video.setVideoUrl(getYoutubeVideoId(video.getVideoUrl()));
        sessionFactory.getCurrentSession().save(video);
        return video.getVideoId();
    }

    @Override
    public void updateVideo(Videos video) {
       
        sessionFactory.getCurrentSession().update(video);
    }

    @Override
    public long deleteVideo(long videoId) {
        
       Videos videos =  (Videos) sessionFactory.getCurrentSession().get(Videos.class,videoId);
       sessionFactory.getCurrentSession().delete(videos);
       return 0;
        
    }

    @Override
    public String getYoutubeVideoId(String youtubeUrl) {
       String video_id = "";
        if (youtubeUrl != null && youtubeUrl.trim().length() > 0 && youtubeUrl.startsWith("http")) {

            String expression = "^.*((youtu.be" + "\\/)" + "|(v\\/)|(\\/u\\/w\\/)|(embed\\/)|(watch\\?))\\??v?=?([^#\\&\\?]*).*"; // var regExp = /^.*((youtu.be\/)|(v\/)|(\/u\/\w\/)|(embed\/)|(watch\?))\??v?=?([^#\&\?]*).*/;
            CharSequence input = youtubeUrl;
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                String groupIndex1 = matcher.group(7);
                if (groupIndex1 != null && groupIndex1.length() == 11) {
                    video_id = groupIndex1;
                }
            }
        }
        return video_id;
    }

    @Override
    public String getYoutubeVideoCode(long videoId) {
       Query query = sessionFactory.getCurrentSession().getNamedQuery("Videos.getYoutubeVideoCode");
        query.setLong("videoId",videoId);
        String videoCode = (String)query.list().get(0);
        return videoCode;
    }

    @Override
    public String getVideoDescription(long videoId) {
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Videos.getYoutubeVideoDescription");
        query.setLong("videoId",videoId);
        return (String)query.uniqueResult();
    }
    
}
