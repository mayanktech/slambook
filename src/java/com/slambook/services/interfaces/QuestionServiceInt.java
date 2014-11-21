/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.services.interfaces;

import com.slambook.entity.Questions;

/**
 *
 * @author mayank sharma
 */
public interface QuestionServiceInt {
 
    
    public void updateQuestion(Questions questions);
    public void deleteQuestion(Questions questions);
    
}
