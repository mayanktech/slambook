/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

import com.slambook.entity.UserInfo;

/**
 *
 * @author Mayank
 */
public interface UserInfoDAOInt {
     public UserInfo getUser(long userId);
     public long addUser(UserInfo user);
     public String updateUser(UserInfo user);
     public void deleteUser(UserInfo user);
     public String getUserEmailById(long userId);
     public long getUserIdByEmail(String email);
     public boolean isAFriend(long userId,long friendId);
     public UserInfo getUserInfo(long userId);
     public boolean checkEmail(String email);
     public boolean loginAuthentication(String email,String password);
}
