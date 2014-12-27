/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

import com.slambook.entity.Album;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface AlbumDAOInt {
    
     public long addAlbum(Album album);
     public void updateAlbum(Album album);
     public long getAlbumCoverImage(long albumId);
     public int getAlbumImageCount(long albumId);
     public void deleteAlbum(long albumId);
     public ArrayList getAlbums(long userId,int clickTimes);
     public ArrayList getAllAlbums(long userId);
     public String getAlbumName(long albumId);
}
