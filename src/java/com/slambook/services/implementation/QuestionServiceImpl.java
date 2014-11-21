/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.services.implementation;

import com.slambook.entity.Questions;
import com.slambook.repository.interfaces.QuestionDAOInt;
import com.slambook.services.interfaces.QuestionServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mayank sharma
 */
@Service
@Transactional
public class QuestionServiceImpl implements QuestionServiceInt{

    @Autowired
    private QuestionDAOInt questionsDAOInterface;
    
  //  @Override
    public void updateQuestion(Questions questions) {
        
        questionsDAOInterface.updateQuestion(questions);
    }

   // @Override
    public void deleteQuestion(Questions questions) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
