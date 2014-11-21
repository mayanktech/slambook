/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slambook.controller;

//import com.slambook.entity.UserInfo;
import com.slambook.entity.UserInfo;
import com.slambook.services.interfaces.UserInfoServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Mayank
 */
@Controller
public class Demo {
    
   
    @Autowired
    private UserInfoServiceInt userInfoDAOServiceInterface;
    
   
    @RequestMapping("/")
	public String Example(Model model) {

                model.addAttribute("user", new UserInfo());
                
		return "index";
	}
    
    @RequestMapping("/index")
	public String Example1(Model model) {

		
                
		return "home";
	}
        
      @RequestMapping("/user")
	public void Example1232(Model model) {

		
            
                
		UserInfo userInfo= new UserInfo();
                userInfo.setFirstName("Mayank");
                
               userInfoDAOServiceInterface.addUser(userInfo);
	}   
    
     @RequestMapping("/user/EditUser")
	public String Example12(Model model) {

		
                
		return "user/AddAnswers";
	}
     
     @RequestMapping("/albums/friend/FriendsAlbum")
	public String Example13(Model model) {

		
                
		return "albums/friend/FriendsAlbum";
	}
     
      @RequestMapping("/albums/user/FriendsAlbumComments")
	public String Example16(Model model) {

		
                
		return "albums/user/FriendsAlbumComments";
	}
     
     
     @RequestMapping("/albums/user/UserAlbumComments")
	public String Example14(Model model) {

		
                
		return "albums/user/UserAlbumComments";
	}
     
      @RequestMapping("/albums/user/UserAlbums")
	public String Example15(Model model) {

		
                
		return "albums/user/UserAlbums";
	}
      
      
      @RequestMapping("/videos/friend/FriendsVideo")
	public String Example113(Model model) {

		
                
		return "videos/friend/FriendsVideo";
	}
     
      @RequestMapping("/videos/friend/FriendsVideoComments")
	public String Example1dsd6(Model model) {

		
                
		return "videos/friend/FriendsVideoComments";
	}
     
     
     @RequestMapping("/videos/user/UserVideoComments")
	public String Example1svv4(Model model) {

		
                
		return "videos/user/UsersVideoComments";
	}
     
      @RequestMapping("/videos/user/UserVideos")
	public String Example15as(Model model) {

		
                
		return "videos/user/UsersVideo";
	}
      
       @RequestMapping("/albums/friend/FriendImageGallery")
	public String Example15aaaas(Model model) {

		
                
		return "albums/friend/FriendsImagesGallery";
	}
    
}
