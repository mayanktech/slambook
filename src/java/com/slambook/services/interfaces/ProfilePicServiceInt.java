/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.interfaces;

import com.slambook.entity.ProfilePic;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface ProfilePicServiceInt {
    public long addProfilePic(ProfilePic profilePic);
    public ArrayList getProfilePics(long userId);
    public long getCurrentProfilePic(long userId);
   
    
}
