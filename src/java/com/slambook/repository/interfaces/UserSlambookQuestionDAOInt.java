/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.interfaces;

//import com.slambook.Entity.UserSlambookQuestions;

/**
 *
 * @author Mayank
 */
public interface UserSlambookQuestionDAOInt {
    
 //  public int addSlambookQuestions(UserSlambookQuestions userSlambookQuestions);
    public int getNumberOfFriendsInSlambook(int slambookId);
    
}
