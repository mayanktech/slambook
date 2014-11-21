/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

import com.slambook.entity.Images;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface ImageDAOInt {
    
    public long addImage(Images image);
     public void updateImage(Images image);
      public long deleteAllImagesFromAlbum(long albumId);
       public long deleteImage(long imageId);
       public ArrayList getImages(long albumId,long userId,long clickTimes);
       public long getImageAlbumId(long imageId);
       public void deleteImages(long userId,long albumId,String imageIds[]);
}
