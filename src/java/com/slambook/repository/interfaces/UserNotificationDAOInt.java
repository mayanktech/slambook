/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

//import com.slambook.Entity.UserNotifications;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface UserNotificationDAOInt {
    
   //  public int addUserNotifiaction(UserNotifications userNotifications);
     public ArrayList getFriendsNotifications(int userId,int clickTimes);
    
}
