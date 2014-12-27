/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.controller;

import com.slambook.entity.VideoLikes;
import com.slambook.entity.Videos;
import com.slambook.services.interfaces.VideoLikeServiceInt;
import java.util.ArrayList;
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
@RequestMapping("/VideoLikes")
public class VideoLikeController {
    
    
    @Autowired
    private VideoLikeServiceInt videoLikeServiceInt;
    
    @RequestMapping(value = "/addVideoLike" ,method = RequestMethod.POST)
    public @ResponseBody long addVideoLike(@ModelAttribute("videoLike") VideoLikes videoLikes){
      
        Videos videos = new Videos();
        videos.setVideoId(videoLikes.getVideoId());
        
        videoLikes.setVideos(videos);
        
        return  videoLikeServiceInt.addLike(videoLikes);
    
    }
    
     @RequestMapping(value = "/removeVideoLike" ,method = RequestMethod.POST)
     public @ResponseBody long removeVideoLike(@ModelAttribute("videoLike") VideoLikes videoLikes){
      
        return  videoLikeServiceInt.removeLike(videoLikes);
    
    }
    
    @RequestMapping(value = "/addVideoLike/{videoId}" ,method = RequestMethod.GET) 
    public String getVideoLikes(@PathVariable("videoId") long videoId,Model model){
    
    ArrayList videoLikes =  videoLikeServiceInt.getVideoLikes(videoId);
    model.addAttribute("videoLikes", videoLikes);
    return "getVideoLikes";
    
    }
    
}
