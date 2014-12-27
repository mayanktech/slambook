/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.services.implementation;

import com.slambook.entity.UserInfo;
import com.slambook.repository.interfaces.UserInfoDAOInt;
import com.slambook.services.interfaces.UserInfoServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mayank sharma
 */

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoServiceInt {

    
    @Autowired
    private UserInfoDAOInt userInfoDAOInt;

    @Override
    public UserInfo getUser(long userId) {
        
        return userInfoDAOInt.getUser(userId);
    }

    @Override
    public long addUser(UserInfo user) {
        
        long userId = userInfoDAOInt.addUser(user);
        return userId;
    }

    @Override
    public String updateUser(UserInfo user) {
        
         return userInfoDAOInt.updateUser(user);
         
    }

    @Override
    public void deleteUser(UserInfo user) {
        
         userInfoDAOInt.deleteUser(user);
         
    }

    @Override
    public String getUserEmailById(long userId) {
        
        return userInfoDAOInt.getUserEmailById(userId);
        
    }

    @Override
    public long getUserIdByEmail(String email) {
        
        return userInfoDAOInt.getUserIdByEmail(email); 
        
    }

    @Override
    public boolean isAFriend(long userId, long friendId) {
        
        return userInfoDAOInt.isAFriend(userId, friendId);
        
    }

    @Override
    public UserInfo getUserInfo(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean checkEmail(String email) {
       
        return userInfoDAOInt.checkEmail(email);
        
    }

    @Override
    public boolean loginAuthentication(String email, String password) {
        
        return userInfoDAOInt.loginAuthentication(email, password);
        
    }

   
   
}
