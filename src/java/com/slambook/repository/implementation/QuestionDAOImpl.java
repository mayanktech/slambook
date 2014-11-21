/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.repository.implementation;

import com.slambook.entity.Questions;
import com.slambook.entity.Slambook;
import com.slambook.repository.interfaces.QuestionDAOInt;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mayank sharma
 */
@Repository
public class QuestionDAOImpl implements QuestionDAOInt{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void updateQuestion(Questions questions) {
       
        sessionFactory.getCurrentSession().update(questions);
        
    }

    @Override
    public void deleteQuestion(Questions questions) {
        sessionFactory.getCurrentSession().delete(questions);
    }

    @Override
    public ArrayList<Questions> fetchQuestionsOfSlambook(Slambook slambook) {
       
       Query query = sessionFactory.getCurrentSession().getNamedQuery("Slambook.getQuestions");
       query.setLong("slambookId",slambook.getSlambookId());
       return (ArrayList<Questions>) query.list();
       
    }
    
}
