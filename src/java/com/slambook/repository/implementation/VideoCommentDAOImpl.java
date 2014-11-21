/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.VideoComments;
import com.slambook.repository.interfaces.VideoCommentDAOInt;
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
public class VideoCommentDAOImpl implements VideoCommentDAOInt {

    
    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    public void addVideoComments(VideoComments videoComments) {
        
        sessionFactory.getCurrentSession().save(videoComments);
        
    }

    @Override
    public ArrayList getVideoComments(long videoId) {
       Query query = sessionFactory.getCurrentSession().getNamedQuery("VideoComments.getVideoComments");
        query.setLong("videoId",videoId);
        return (ArrayList) query.list();
    }

    @Override
    public long getVideoCommentsCount(long videoId) {
       Query query = sessionFactory.getCurrentSession().getNamedQuery("VideoComments.getVideoCommentsCount");
        query.setLong("videoId",videoId);
        return ((Long)(query.uniqueResult())).intValue();
    }
    
}
