/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.controller;

import com.slambook.entity.VideoComments;
import com.slambook.entity.Videos;
import com.slambook.services.interfaces.VideoCommentServiceInt;
import com.slambook.services.interfaces.VideoServiceInt;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author mayank
 */
@Controller
@RequestMapping("/VideoComments")

public class VideoCommentController {
    
    @Autowired
    private VideoCommentServiceInt videoCommentServiceInt;
    
    @Autowired
    private VideoServiceInt videoServiceInt;
    
    @RequestMapping(value = "/addVideoComment")
    public @ResponseBody long addVideoComment(@ModelAttribute("videoComments") VideoComments videoComments){
        
        Videos videos = new Videos();
        videos.setVideoId(videoComments.getVideoId());
        
        videoComments.setDate(new Date());
        videoComments.setVideos(videos);
        
        videoCommentServiceInt.addVideoComments(videoComments);
        return videoComments.getCommentId();
        
    }
    
    @RequestMapping("/getVideoComments/{videoId}")
    public String getVideoComments(@PathVariable("videoId") long videoId,Model model){
    
    ArrayList videoCommentsList = videoCommentServiceInt.getVideoComments(videoId);
    model.addAttribute("videoCommentsList", videoCommentsList);
    model.addAttribute("videoCode",videoServiceInt.getYoutubeVideoCode(videoId));
    return "VideoComments";
    
    }
   
    
}
