/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.repository.implementation;

import com.slambook.entity.UserInfo;
import com.slambook.repository.interfaces.SlambookDAOInt;
import com.slambook.repository.interfaces.UserInfoDAOInt;
import java.util.Random;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mayank sharma
 */
@Repository
@Transactional
public class UserInfoDAOImpl implements UserInfoDAOInt{

    
    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    private SlambookDAOInt slambookDAOInterface;
    
   
    
    @Override
    public UserInfo getUser(long userId) {
       
        return  (UserInfo) sessionFactory.getCurrentSession().get(UserInfo.class,userId);
        
    }

    @Override
    public long addUser(UserInfo userInfo) {
        
        sessionFactory.getCurrentSession().save(userInfo);
        
        long range = 12345678999999999L;
        Random r = new Random();
        long number = (long)(r.nextDouble()*range);
        userInfo.setVerificationKey(Long.toString(number));
        
        slambookDAOInterface.addSlambook("My Slambook", userInfo);
        
         
        return userInfo.getUserId();
        
    }

    @Override
    public String updateUser(UserInfo user) {
       
        Query query = sessionFactory.getCurrentSession().getNamedQuery("UserInfo.updateUserInfo");
        query.setString("tagline", user.getTagline());
        query.setString("introduction", user.getIntroduction());
        query.setString("braggingRights", user.getBraggingRights());
        query.setString("placesLived", user.getPlacesLived());
        query.setString("lookingFor",user.getLookingFor());
        query.setString("birthday", user.getBirthday());
        query.setString("email", user.getEmail());
        query.setString("relationshipStatus", user.getRelationshipStatus());
        query.setString("school", user.getSchool());
        query.setString("college", user.getCollege());
        query.setString("website", user.getWebsite());
        query.executeUpdate();
        return "Updated";
    }

    @Override
    public void deleteUser(UserInfo user) {
        
         sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public String getUserEmailById(long userId) {
       
        Query query = sessionFactory.getCurrentSession().getNamedQuery("UserInfo.getEmailById");
        query.setLong("userId",userId);
        return (String) query.uniqueResult();
    }

    @Override
    public long getUserIdByEmail(String email) {
        
        Query query = sessionFactory.getCurrentSession().getNamedQuery("UserInfo.getUserIdByEmail");
        query.setString("email",email);
        return (long)query.uniqueResult();
    }

    @Override
    public boolean isAFriend(long userId, long friendId) {
        
        Query query = sessionFactory.getCurrentSession().getNamedQuery("SlambookAnswers.isAFriend");
        query.setLong("userId",userId);
        query.setLong("senderId",friendId);
        return (Boolean) query.uniqueResult();
    }

    @Override
    public UserInfo getUserInfo(long userId) {
         
        return  (UserInfo) sessionFactory.getCurrentSession().get(UserInfo.class,userId);
    }

    @Override
    public boolean checkEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean loginAuthentication(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
