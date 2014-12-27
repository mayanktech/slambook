/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.controller;

import com.slambook.entity.UserInfo;
import com.slambook.entity.Videos;
import com.slambook.services.interfaces.VideoServiceInt;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mayank
 */
@Controller
@RequestMapping("/Videos")
public class VideoController {
    
    @Autowired
    private VideoServiceInt videoServiceInt;
    
     @RequestMapping(value = "/addVideo" ,method = RequestMethod.POST)
    public @ResponseBody long addVideo(@ModelAttribute("video") Videos videos,HttpSession httpSession){
    
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(Long.parseLong(httpSession.getAttribute("userId").toString()));
        videos.setUserInfo(userInfo);
        return videoServiceInt.addVideo(videos);
     
    }
    
    @RequestMapping(value = "/deleteVideo/{videoId}" ,method = RequestMethod.POST)
    public @ResponseBody long deleteVideo(@PathVariable("videoId") int videoId){
    
       return videoServiceInt.deleteVideo(videoId);
    
    }
    
     @RequestMapping(value = "/getVideos/{userId}/{clickTimes}" ,method = RequestMethod.POST)
    public String getVideos(@PathVariable("userId") long userId,@PathVariable("clickTimes") int clickTimes, Model model){
     
     ArrayList videosList = videoServiceInt.getVideos(userId, clickTimes);
     model.addAttribute("videosList", videosList);
     return "getVideos";
         
     }
     
    @RequestMapping(value = "/LoadMoreUserVideos/{userId}/{clickTimes}" ,method = RequestMethod.POST)
    public String getMoreUserVideos(@PathVariable("userId") long userId,@PathVariable("clickTimes") int clickTimes, Model model){
     
     ArrayList videosList = videoServiceInt.getVideos(userId, clickTimes);
     model.addAttribute("videoList", videosList);
     return "LoadMoreUserVideos";
         
     }
     
     @RequestMapping(value = "/getFriendsVideos/{friendId}/{clickTimes}" ,method = RequestMethod.POST)
    public String getFriendsVideos(@PathVariable("friendId") long friendId,@PathVariable("clickTimes") int clickTimes, Model model){
     
     ArrayList videosList = videoServiceInt.getVideos(friendId, clickTimes);
     model.addAttribute("videoList", videosList);
     return "viewFriendsVideos";
         
     }
    
}
