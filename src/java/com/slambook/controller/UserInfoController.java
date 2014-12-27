/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.controller;

import com.slambook.entity.Album;
import com.slambook.entity.ProfilePic;
import com.slambook.entity.UserInfo;
import com.slambook.services.interfaces.AlbumServiceInt;
import com.slambook.services.interfaces.FriendServiceInt;
import com.slambook.services.interfaces.ProfilePicServiceInt;
import com.slambook.services.interfaces.SlamBookAnswerServiceInt;
import com.slambook.services.interfaces.UserInfoServiceInt;
import com.slambook.services.interfaces.VideoServiceInt;
import java.io.File;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author mayank
 */
@Controller
@RequestMapping("/UserInfo")
public class UserInfoController {
    
    @Autowired
    private ServletContext servletContext;
    
    @Autowired
    private UserInfoServiceInt userInfoServiceInt;
    
    @Autowired
    private AlbumServiceInt albumServiceInt;
    
    @Autowired
    private FriendServiceInt friendServiceInt;
    
    @Autowired
    private SlamBookAnswerServiceInt slamBookAnswerServiceInt;
    
    @Autowired
    private ProfilePicServiceInt profilePicServiceInt;
    
    @Autowired
    private VideoServiceInt videoServiceInt;
    
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(@RequestParam("userId") long userId, Model model, HttpSession session){
        
        UserInfo userInfo = userInfoServiceInt.getUser(userId);
        userInfo.setAlbumList(albumServiceInt.getAlbums(userId,0));
        userInfo.setVideosList(videoServiceInt.getVideos(userId, 0));
        userInfo.setProfilePic(profilePicServiceInt.getCurrentProfilePic(userId));
        userInfo.setFriendsList(friendServiceInt.getUserFriends(userId));
        //userInfo.setSlambookList(slamBookAnswerServiceInt);
        
        model.addAttribute("profilepic",new ProfilePic());
       // model.addAttribute("imageFileUpload",new ImageFileUpload());
        model.addAttribute("albums",new Album());
        model.addAttribute("userInfo", userInfo);
        
        return "home";
    }
    
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addUser(UserInfo userInfo){
        
      long userId =  userInfoServiceInt.addUser(userInfo);
      String realPath = servletContext.getRealPath("/")+"WEB-INF/jsp/resources";
        File file = new File(realPath+"/users/"+userId);
        file.mkdirs();
        File file1 = new File(realPath+"/users/"+userId+"/albums");
        file1.mkdirs();
        File file2 = new File(realPath+"/users/"+userId+"/mp3");
        file2.mkdirs();
        File file3 = new File(realPath+"/users/"+userId+"/profilepic");
        file3.mkdirs();
        File file4 = new File(realPath+"/users/"+userId+"/profilepic/"+"thumbs");
        file4.mkdirs();
     

    
    }
    
    
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(UserInfo userInfo,HttpSession httpSession){
        
        long userId =  Long.parseLong(httpSession.getAttribute("userId").toString());
        userInfo.setUserId(userId);
        userInfoServiceInt.updateUser(userInfo);
    
    }
    
    @RequestMapping(value = "/checkEmail",method = RequestMethod.POST)
    public @ResponseBody boolean checkEmail(@RequestParam("email") String email){
    
        return userInfoServiceInt.checkEmail(email);
    
    }
    
    
    @RequestMapping(value = "/loginAuthentication",method = RequestMethod.POST)
    public String loginAuthentication(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session){
    
     String redirectUrl = "";
     Boolean status = userInfoServiceInt.loginAuthentication(email, password);
     if(status == Boolean.TRUE){
     
         long userId = userInfoServiceInt.getUserIdByEmail(email);
         session.setAttribute("userId", userId);
         redirectUrl = "redirect:/UserInfo/getUser?userId="+userId;
     
     }
     else{
     
     redirectUrl = "redirect:/errorLoginPage";
     
     }
        
     return redirectUrl;
    
    }

    
}
