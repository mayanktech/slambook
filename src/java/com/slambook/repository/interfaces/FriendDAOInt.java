/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.longerfaces;

import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface FriendDAOInt {
    
     public ArrayList searchFriendsByName(String name,long currentUserId);
     public ArrayList searchFriendsByEmail(String email);
     public ArrayList getUserFriends(long userId);
     public void acceptRequest(long userId,long friendId);
     public void cancelRequest(long userId,long friendId);
     public boolean isAlreadyAFriend(long friendId,long userId);
     public long getNumberOfMutualFriends(long friendId);
     public ArrayList getIdsOfUserFriends(long userId);
    
}
