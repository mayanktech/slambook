/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.repository.interfaces;

import com.slambook.entity.Slambook;
import com.slambook.entity.UserInfo;
import java.util.ArrayList;

/**
 *
 * @author mayank sharma
 */
public interface SlambookDAOInt {
    
    public long addSlambook(String slambookName,UserInfo userInfo,ArrayList<com.slambook.entity.Questions> questionsList);
    public void deleteSlambook(Slambook slambook);
    
}
