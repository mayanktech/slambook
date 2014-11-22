/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.repository.implementation;

import com.slambook.entity.Answers;
import com.slambook.repository.interfaces.AnswerDAOInt;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author mayank
 */
@Repository
public class AnswersDAOImpl implements AnswerDAOInt {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void addAnswer(Answers answer) {
        
        sessionFactory.getCurrentSession().save(answer);
    }

    @Override
    public Answers getAnswer(long questionId,long friendId) {
        
        Query query = sessionFactory.getCurrentSession().getNamedQuery("Answers.getAnswer");
        query.setLong("questionId", questionId);
        query.setLong("friendId",friendId);
       
        return (Answers)query.list().get(0);
        
        
    }
    
}
