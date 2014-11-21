/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

import com.slambook.entity.ImageComments;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface ImageCommentDAOInt {

    public ArrayList getImageComments(long imageId);
    public void addImageComments(ImageComments imageComments);
    public long getImageCommentsCount(long imageId) ;
}


