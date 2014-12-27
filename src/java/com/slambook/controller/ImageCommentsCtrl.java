/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slambook.controller;

import com.slambook.entity.ImageComments;
import com.slambook.services.interfaces.ImageCommentServiceInt;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mayank sharma
 */

@RequestMapping("/imagecomments")
public class ImageCommentsCtrl {
    
    @Autowired
    public ImageCommentServiceInt imageCommentServiceInt;
    
    @RequestMapping("/getcomments/{albumId}/{imageId}")
    public ArrayList getImageComments(@PathVariable("imageId") int imageId,@PathVariable("albumId")int albumId,Model model){
    
        ArrayList<com.slambook.entity.ImageComments> imageComments = imageCommentServiceInt.getImageComments(imageId);
        
        model.addAttribute("imageId", imageId);
        model.addAttribute("albumId", albumId);
        model.addAttribute("imageComments", imageComments);
        
        return imageComments;
    
    }
    
    @RequestMapping("/addcomment")
    public int addImageComments(@RequestBody ImageComments imageComments){
    
      
    return 0;
    }
    
    @RequestMapping("/getcommentscount/{imageId}")
    public int getImageCommentsCount(int imageId){
        
        int imageCommentCount = 0;
        
        return imageCommentCount;
    }    

    
}
