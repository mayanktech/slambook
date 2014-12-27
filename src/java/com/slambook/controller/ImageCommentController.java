/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.controller;

import com.slambook.entity.ImageComments;
import com.slambook.entity.Images;
import com.slambook.services.interfaces.ImageCommentServiceInt;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
@RequestMapping("/ImageComments")
public class ImageCommentController {
    
    @Autowired
    private ImageCommentServiceInt imageCommentServiceInt;
    
    @RequestMapping("/getImageComments/{albumId}/{imageId}")
    public String getImageComments(@PathVariable("imageId") long imageId,@PathVariable("albumId") long albumId,Model model){
    
    ArrayList imageCommentList = imageCommentServiceInt.getImageComments(imageId);
    model.addAttribute("imageComments", imageCommentList);
    model.addAttribute("älbumId",albumId);
    model.addAttribute("imageId",imageId);
    return "ImageComments";
    
    }
    
    @RequestMapping("/getFriendsImageComments/{albumId}/{imageId}/{friendId}")
    public String getFriendsImageComments(@PathVariable("imageId") long imageId,@PathVariable("albumId") long albumId,@PathVariable("friendId") long friendId,Model model){
    
    ArrayList imageCommentList = imageCommentServiceInt.getImageComments(imageId);
    model.addAttribute("imageComments", imageCommentList);
    model.addAttribute("älbumId",albumId);
    model.addAttribute("imageId",imageId);
    model.addAttribute("friendId",friendId);
    return "FriendImageComments";
    
    }
    
     @RequestMapping(value = "/addImageComment" ,method = RequestMethod.POST)
     public @ResponseBody long addImageComment(@ModelAttribute("imageComments") ImageComments imageComments,BindingResult bindingResult){
     
     //Suspicion
     Images images = new Images();
     images.setImageId(Long.parseLong(imageComments.getImageId()));
     
     imageComments.setImages(images);
     imageComments.setCreatedOn(new Date());
         
     imageCommentServiceInt.addImageComments(imageComments);
     return imageComments.getCommentId();
         
     }
     
     
    
}
