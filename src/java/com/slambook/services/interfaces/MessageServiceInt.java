/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.services.interfaces;

//import com.slambook.entity.Messages;
import java.util.ArrayList;

/**
 *
 * @author Mayank
 */
public interface MessageServiceInt {
   
 //  public int sendMessage(Messages message);
   public ArrayList getConversationMessagesFromFriend(int senderId,int receiverId,int clickTimes);
   public ArrayList getTop10Messages(int receiverId);
   public ArrayList getRealTimeMessages(int senderId,int userId,int messageId);
   public int getRealTimeMessageId(int senderId,int userId,int messageId);
    
}
