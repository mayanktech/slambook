/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.Album;
import com.slambook.entity.ImageLikes;
import com.slambook.entity.Images;
import com.slambook.repository.interfaces.ImageLikeDAOInt;
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
public class ImageLikesDAOImplementation implements ImageLikeDAOInt {

    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    public long addLike(ImageLikes imageLikes) {
        
        sessionFactory.getCurrentSession().save(imageLikes);
        
        return getImageLikesCount(imageLikes.getImages().getImageId()); 
        
        
    }

    @Override
    public long removeLike(ImageLikes imageLikes) {
     
        Query query = sessionFactory.getCurrentSession().getNamedQuery("ImageLikes.removeLike");
        query.setLong("imageId",imageLikes.getImages().getImageId());
        query.setLong("userId", imageLikes.getUserInfo().getUserId());
        query.executeUpdate();
        return getImageLikesCount(imageLikes.getImages().getImageId()); 
    }

    @Override
    public ArrayList getImageLikes(long imageId) {
        
     Query query = sessionFactory.getCurrentSession().getNamedQuery("ImageLikes.getImageLikes");
     query.setLong("imageId",imageId);
     return  (ArrayList) query.list();
     
        
    }

    @Override
    public long getImageLikesCount(long imageId) {
     
     Query query = sessionFactory.getCurrentSession().getNamedQuery("ImageLikes.getImageLikesCount");
     query.setLong("imageId",imageId);
     return ((Long)query.uniqueResult()).longValue();
    }

    @Override
    public long returnImageLikesCount(long imageId) {
     Query query = sessionFactory.getCurrentSession().getNamedQuery("ImageLikes.getImageLikesCount");
     query.setLong("imageId",imageId);
     return (long)query.uniqueResult();
    }

    @Override
    public boolean isAlreadyLiked(long imageId, long userId) {
     Boolean alreadyLiked = Boolean.FALSE;
     Query query = sessionFactory.getCurrentSession().getNamedQuery("ImageLikes.isAlreadyLiked");
     query.setLong("imageId",imageId);
     query.setLong("userId",userId);
     if(query.uniqueResult() != null){
     
     alreadyLiked = Boolean.TRUE;
         
     }
     return alreadyLiked;
     
    }
    
}
