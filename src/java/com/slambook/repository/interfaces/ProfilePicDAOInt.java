/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

import com.slambook.entity.ProfilePic;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface ProfilePicDAOInt {
      
   public int addProfilePic(ProfilePic profilePic);
    public ArrayList getProfilePics(int userId);
     public int getCurrentProfilePic(int userId);
   
}
