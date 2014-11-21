/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.Images;
import com.slambook.repository.interfaces.ImageDAOInt;
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
public class ImagesDAOImplementation implements ImageDAOInt {

    
    @Autowired
    private SessionFactory sessionFactory;
    
    
    @Override
    public long addImage(Images image) {
        
        sessionFactory.getCurrentSession().save(image);
        return image.getImageId();
        
    }

    @Override
    public void updateImage(Images image) {
        
        sessionFactory.getCurrentSession().update(image);
        
    }

    @Override
    public long deleteAllImagesFromAlbum(long albumId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long deleteImage(long imageId) {
        
        Images image = (Images) sessionFactory.getCurrentSession().get(Images.class, imageId);
        sessionFactory.getCurrentSession().delete(image);
        return 0; 
    }

    @Override
    public ArrayList getImages(long albumId, long userId, long clickTimes) {
        
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Images.getImages");
        query.setLong("albumId",albumId);
        
        return (ArrayList) query.list();
        
        
    }

    @Override
    public long getImageAlbumId(long imageId) {
       Query query = sessionFactory.getCurrentSession().getNamedQuery("Images.getImageAlbumId");
        query.setLong("imageId",imageId);
        long imageAlbumId = (long)query.uniqueResult();
        return imageAlbumId;
     
    }

    @Override
    public void deleteImages(long userId, long albumId, String[] imageIds) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
