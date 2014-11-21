/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.repository.interfaces;

import com.slambook.entity.Questions;
import com.slambook.entity.Slambook;
import java.util.ArrayList;

/**
 *
 * @author mayank sharma
 */
public interface QuestionDAOInt {
    
    public void updateQuestion(Questions questions);
    public void deleteQuestion(Questions questions);
    public ArrayList<com.slambook.entity.Questions> fetchQuestionsOfSlambook(Slambook slambook);
    
}
