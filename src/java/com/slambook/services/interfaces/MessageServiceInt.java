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
   
 //  public long sendMessage(Messages message);
   public ArrayList getConversationMessagesFromFriend(long senderId,long receiverId,int clickTimes);
   public ArrayList getTop10Messages(long receiverId);
   public ArrayList getRealTimeMessages(long senderId,long userId,long messageId);
   public long getRealTimeMessageId(long senderId,long userId,long messageId);
    
}
