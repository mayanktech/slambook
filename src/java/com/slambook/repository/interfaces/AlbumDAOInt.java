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
    
     public int addAlbum(Album album);
     public void updateAlbum(Album album);
     public int getAlbumCoverImage(int albumId);
     public int getAlbumImageCount(int albumId);
     public void deleteAlbum(int albumId);
     public ArrayList getAlbums(int userId,int clickTimes);
     public ArrayList getAllAlbums(int userId);
     public String getAlbumName(int albumId);
}
