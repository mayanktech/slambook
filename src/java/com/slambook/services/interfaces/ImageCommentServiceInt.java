/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.interfaces;

import com.slambook.entity.ImageComments;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface ImageCommentServiceInt {
    
public ArrayList getImageComments(long imageId);
public long addImageComments(ImageComments imageComments);
public long getImageCommentsCount(long imageId) ;    

}
