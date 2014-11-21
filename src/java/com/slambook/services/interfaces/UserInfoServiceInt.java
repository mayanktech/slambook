/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.interfaces;

import com.slambook.entity.UserInfo;
//import com.slambook.entity.UserInfoMobile;

/**
 *
 * @author Mayank
 */
public interface UserInfoServiceInt {
     public UserInfo getUser(String userId);
     public long addUser(UserInfo user);
     public String updateUser(UserInfo user);
     public void deleteUser(UserInfo user);
     public String getUserEmailById(String userId);
     public String getUserIdByEmail(String email);
     public boolean isAFriend(String userId,String friendId);
     public UserInfo getUserInfo(String userId);
     public boolean checkEmail(String email);
     public boolean loginAuthentication(String email,String password);
}
