/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.repository.implementation;

import com.slambook.entity.Questions;
import com.slambook.entity.Slambook;
import com.slambook.entity.UserInfo;
import com.slambook.repository.interfaces.SlambookDAOInt;
import java.util.ArrayList;
import java.util.Date;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mayank sharma
 */
@Repository
@Transactional
public class SlambookDAOImpl implements SlambookDAOInt{

    @Autowired
    private SessionFactory sessionFactory;
    
 
    @Override
    public long addSlambook(String slambookName, UserInfo userInfo,ArrayList<com.slambook.entity.Questions> questionsList) {
        
        Slambook slambook = new Slambook();
        slambook.setUserInfo(userInfo);
        slambook.setSlambookName("My slambook");
        slambook.setSlambookCreationDate(new Date());
        
        
        
        if(questionsList == null){
        ArrayList<com.slambook.entity.Questions> defaultQuestionsList = new ArrayList<>();
        Questions question1 = new Questions("qwe1",slambook);
        Questions question2 = new Questions("qwe1",slambook);
        Questions question3 = new Questions("qwe1",slambook);
        Questions question4 = new Questions("qwe1",slambook);
        Questions question5 = new Questions("qwe1",slambook);
        Questions question6 = new Questions("qwe1",slambook);
        Questions question7 = new Questions("qwe1",slambook);
        Questions question8 = new Questions("qwe1",slambook);
        Questions question9 = new Questions("qwe1",slambook);
        Questions question10 = new Questions("qwe1",slambook);
        Questions question11 = new Questions("qwe1",slambook);
        Questions question12 = new Questions("qwe1",slambook);
        Questions question13 = new Questions("qwe1",slambook);
        Questions question14 = new Questions("qwe1",slambook);
        
        defaultQuestionsList.add(question1);
        defaultQuestionsList.add(question2);
        defaultQuestionsList.add(question3);
        defaultQuestionsList.add(question4);
        defaultQuestionsList.add(question5);
        defaultQuestionsList.add(question6);
        defaultQuestionsList.add(question7);
        defaultQuestionsList.add(question8);
        defaultQuestionsList.add(question9);
        defaultQuestionsList.add(question10);
        defaultQuestionsList.add(question11);
        defaultQuestionsList.add(question12);
        defaultQuestionsList.add(question13);
        defaultQuestionsList.add(question14);
        slambook.setSlambookQuestions(defaultQuestionsList);
        }
        else{
        slambook.setSlambookQuestions(questionsList);
        }
        
        sessionFactory.getCurrentSession().save(slambook);
        
        return slambook.getSlambookId();
        
    }

    @Override
    public void deleteSlambook(Slambook slambook) {
        
        sessionFactory.getCurrentSession().delete(slambook);
    }

  
    
}
