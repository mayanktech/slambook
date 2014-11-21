/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.ImageComments;
import com.slambook.repository.interfaces.ImageCommentDAOInt;
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
public class ImageCommentsDAOImplementation implements ImageCommentDAOInt {

    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    public ArrayList getImageComments(long imageId) {
       
        Query query = sessionFactory.getCurrentSession().getNamedQuery("ImageComments.getImageComments");
        query.setLong("imageId", imageId);
        return (ArrayList) query.list();
        
        
    }

    @Override
    public void addImageComments(ImageComments imageComments) {
        sessionFactory.getCurrentSession().save(imageComments);
    }

    @Override
    public long getImageCommentsCount(long imageId) {
        Query query = sessionFactory.getCurrentSession().getNamedQuery("ImageComments.getImageCommentsCount");
        query.setLong("imageId", imageId);
        return ((Long)query.uniqueResult()).intValue();
    }
    
}
