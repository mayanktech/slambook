/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.repository.longerfaces.FriendDAOInt;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mayank
 */
@Repository
public class FriendsDAOImpl implements FriendDAOInt{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public ArrayList searchFriendsByName(String name, long currentUserId) {
       
        name = name+"%";
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Friends.searchFriendsByName");
        query.setString("searchString",name.replace(" ", ""));
        return (ArrayList) query.list();
    }

    @Override
    public ArrayList searchFriendsByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getUserFriends(long userId) {
        
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Friends.getUserFriends");
        query.setLong("userId",userId);
        query.setBoolean("allow", true);
        return (ArrayList) query.list();
    }

    @Override
    public void acceptRequest(long userId, long friendId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cancelRequest(long userId, long friendId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isAlreadyAFriend(long friendId, long userId) {
        
         boolean status = false;
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Friends.isAlreadyAFriend");
        query.setLong("userId",userId);
        query.setLong("senderId",friendId);
        
        if(!query.list().isEmpty()){
    
        status = true;
    
        }
       
        return status;
    }

    @Override
    public long getNumberOfMutualFriends(long friendId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList getIdsOfUserFriends(long userId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
