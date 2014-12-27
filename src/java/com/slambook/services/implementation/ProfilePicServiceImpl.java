/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.implementation;

import com.slambook.entity.ProfilePic;
import com.slambook.services.interfaces.ProfilePicServiceInt;
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mayank
 */
@Service
@Transactional
public class ProfilePicServiceImpl implements ProfilePicServiceInt{

    @Override
    public long addProfilePic(ProfilePic profilePic) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getProfilePics(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long getCurrentProfilePic(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
