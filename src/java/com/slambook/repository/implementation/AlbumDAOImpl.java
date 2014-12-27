/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.Album;
import com.slambook.repository.interfaces.AlbumDAOInt;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author mayank
 */
public class AlbumDAOImpl implements AlbumDAOInt {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public long addAlbum(Album album) {

        sessionFactory.getCurrentSession().save(album);
        return album.getAlbumId();
    }

    @Override
    public void updateAlbum(Album album) {

        sessionFactory.getCurrentSession().update(album);

    }

    @Override
    public long getAlbumCoverImage(long albumId) {

        Query query = sessionFactory.getCurrentSession().getNamedQuery("Album.getAlbumCoverImage");
        query.setLong("albumId", albumId);
        long coverImage;
        coverImage = (Long) query.list().get(0);
        return coverImage;
    }

    @Override
    public int getAlbumImageCount(long albumId) {

        Query query = sessionFactory.getCurrentSession().getNamedQuery("Album.getAlbumImageCount");
        query.setLong("albumId", albumId);
        int imageCount = ((Long) query.uniqueResult()).intValue();
        return imageCount;
    }

    @Override
    public void deleteAlbum(long albumId) {

        Album album = (Album) sessionFactory.getCurrentSession().get("Album", albumId);
        sessionFactory.getCurrentSession().delete(album);

    }

    @Override
    public ArrayList getAlbums(long userId, int clickTimes) {

        int start = 0;
        int end = 0;

        if (clickTimes == 0) {

            start = 0;
            end = 4;

        } else {

            start = 4 * clickTimes;
            end = 4;

        }

        Query query = sessionFactory.getCurrentSession().getNamedQuery("Album.getUserAlbums");
        query.setLong("userId", userId);
        query.setFirstResult(start);
        query.setMaxResults(end);
        return (ArrayList) query.list();

    }

    @Override
    public ArrayList getAllAlbums(long userId) {
        
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Album.getAllAlbumName");
        query.setLong("userId",userId);
        return (ArrayList) query.list();
        
    }

    @Override
    public String getAlbumName(long albumId) {
        
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Album.getAlbumName");
        query.setLong("albumId",albumId);
        String albumName = (String)query.uniqueResult();
        return albumName;
     
    }

}
