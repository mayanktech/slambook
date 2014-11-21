/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.VideoLikes;
import com.slambook.repository.interfaces.VideoLikeDAOInt; 
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mayank
 */
@Repository
public class VideoLikeDAOImpl implements VideoLikeDAOInt {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public long addLike(VideoLikes videoLikes) {
        
        sessionFactory.getCurrentSession().save(videoLikes);
        
        return getVideoLikesCount(videoLikes.getVideoId());
        
    }

    @Override
    public long removeLike(VideoLikes videoLikes) {
       
        long videoId = videoLikes.getVideoLikeId();
        sessionFactory.getCurrentSession().delete(videoLikes);
        return getVideoLikesCount(videoId);
        
    }

    @Override
    public ArrayList getVideoLikes(long videoId) {
        Query query = sessionFactory.getCurrentSession().getNamedQuery("VideoLikes.getVideoLikes");
        query.setLong("videoId",videoId);
        return (ArrayList) query.list();
        
    }

    @Override
    public long getVideoLikesCount(long videoId) {
        Query query = sessionFactory.getCurrentSession().getNamedQuery("VideoLikes.getVideoLikesCount");
        query.setLong("videoId",videoId);
        return (long) query.uniqueResult();
       
    }

    @Override
    public long returnVideoLikesCount(long videoId) {
       Query query = sessionFactory.getCurrentSession().getNamedQuery("VideoLikes.getVideoLikesCount");
        query.setLong("videoId",videoId);
        return  (long) query.uniqueResult();
    }

    @Override
    public boolean isAlreadyLiked(long videoId, long userId) {
        Query query = sessionFactory.getCurrentSession().getNamedQuery("VideoLikes.isAlreadyLiked");
        query.setLong("videoId",videoId);
        query.setLong("userId", userId);
        long i = query.list().size();
        
        if(i != 0){
        
            return true;
        
        }
        else{
        
            return false;
        
        }
        
    }
    
}
