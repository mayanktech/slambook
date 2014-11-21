/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.repository.interfaces;

import com.slambook.entity.Answers;

/**
 *
 * @author mayank sharma
 */
public interface AnswerDAOInt {
    
    public void addAnswer(long questionId,Answers answer);
    public Answers getAnswer(long questionId);
}
