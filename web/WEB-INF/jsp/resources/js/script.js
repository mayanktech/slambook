/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var signup;
var gallery;
var signUpForm = function(firstName,lastName,email,password,conpassword,sex,dob){
    
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.conpassword = conpassword;
    this.sex = sex;
    this.dob = dob;
    this.fieldStatus = true;
    this.passwordStatus = true;
    this.validEmailStatus = true;
    this.emailRegisteredStatus = true;
    
    this.formRef = $(".formTable");
    this.firstNameRef = $("#firstName");
    this.sexRef = $("#gender");
    this.dobRef = $("#birthday");
    this.lastNameRef = $("#larstName");
    this.emailRef = $("#email");
    this.passwordRef = $("#password");
    this.conPasswordRef = $("#repeatPassword");
    this.submitBtnRef = $("#signUpBtn");
    
    
    this.validatePassword = function(){
        
          if(this.conpassword.length !== 0){

            if(this.password == this.conpassword  ){

                //$('#checkPassword').attr("src","images/correct.gif");
                this.passwordStatus = true;
           

            }
            else{

               // $('#checkPassword').attr("src","images/wrong.png");
            //$('#checkPassword').css("display","inline");
                this.passwordStatus = false;
           
                
            }

        }
       
    };
    
    this.validateEmptyFields = function(){
        
       
        $(".formTable").find('input[type="text"],input[type="password"]').each(function(){
           
       
            if($(this).val().trim() == ""){
 
                signup.fieldStatus = false;
               
           
            
            }
            else{
                
                signup.fieldStatus = true;
                
            }


        });
    };
    
    this.validateEmail = function(){
        
        
         var filter = /^([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;

             if (filter.test(this.email)) {

             
             this.validEmailStatus = true;
           
           

            }

            else {

                    this.validEmailStatus = false;
           
        
                }
        
        
    };
    this.emailRegisteredStatusCheck = function(){
      
        $.ajax({

                    url:'UserInfo/checkEmail',
                    type:'post',

                    data:{
                        email:this.email
                    }

                }).success(function(msg){

                    
                    if (msg == false){

                      //  $('#checkEmail').attr("src", "resources/images/correct.gif");
                      //  checkemailajax ="true";
                      this.emailRegisteredStatus = true;
           
                      
                    }
                    else{

                        //$('#checkEmail').attr("src", "resources/images/wrong.png");
                        //status = "falseemail";
                        //checkemailajax ="true";
                        this.emailRegisteredStatus = true;
           
                        
                    }


                });
        
    };
    
    this.displayError = function(){
        
        
        
        if(!this.fieldStatus){
            
            var d  = new simpleDialog("Some Fields Are Empty","danger");
            d.show();
            
        }
        
        else if(!this.validEmailStatus){
            
            var d  = new simpleDialog("Email Is Not Valid","danger");
            d.show();

        
        }
        
        else if(!this.passwordStatus){
            
            var d  = new simpleDialog("Passwords did not Match","danger");
            d.show();
            
            
        }
        
        else if(!this.emailRegisteredStatus){
            
            var d  = new simpleDialog("Email Is Already Regitered","danger");
            d.show();
            
            
        }
        
    };
    
    this.submitForm = function(){
        
        var loadingDialog = new bodyOnlyDialog("Loading Please Wait");
        loadingDialog.show();
        
        $.ajax({
            
            url:"userInfo/addUser",
            type:'post',
            data:$('#signUp').serialize()
        }).success(function(){
            
            loadingDialog.hide();
            $('#signUp').get(0).reset();
        });
        
    };
    
};


var dialog = function(message,title){
    
    this.message = message;
    this.title=title;
    this.dialogRef = $("#fullModal");
    this.dialogBodyRef = $("#fullModal .modal-body");
    this.dialogTitleRef = $("#fullModal .modal-title");
    this.dialogSecondaryBtnRef = $("#fullModal #dialogSecondaryBtn");
    this.show = function(){
        
        this.dialogBodyRef.html(this.message);
        this.dialogTitleRef.html(this.title);
        this.dialogRef.modal('show');
    };
    
    this.hide = function(){
        
        this.dialogRef.modal('hide');
        
    };
    
};

var bodyOnlyDialog = function(message){
    this.message = message;
    
    this.dialogRef = $("#bodyOnlyModal");
    this.dialogBodyRef = $("#bodyOnlyModal .modal-body");
    this.show = function(){
        
        this.dialogBodyRef.html(this.message);
       
        this.dialogRef.modal('show');
    };
    
    this.hide = function(){
        
        this.dialogRef.modal('hide');
        
    };
};


var simpleDialog = function(message,type){
    
    this.alertclass;
    this.message = message;
    this.dialogText;
    this.typeOfDialogText;
    this.type = type;
    this.alertRef = $(".alert");
    this.alertTypeRef = $(".alert strong");
    this.alertTextRef = $(".alert span");
    this.closeBtnRef = $(".alert .close");
    if(this.type == "danger"){
        
        this.alertclass="alert-danger";
        this.typeOfDialogText = "Error ! ";
    }
    else if(this.type == "success"){
        
        this.alertclass="alert-success";
        this.typeOfDialogText = "Success ! ";
    }
    else if(this.type == "warning"){
        
        this.alertclass="alert-warning";
        this.typeOfDialogText = "Warning ! ";
    }
    else if(this.type == "info"){
        
        this.alertclass="alert-info";
        this.typeOfDialogText = "Information ! ";
    }
    
    this.alertRef.addClass(this.alertclass);
    this.alertTypeRef.html(this.typeOfDialogText);
    this.alertTextRef.html(this.message);
    this.show = function(){
      
        $(".simpleDialog").fadeIn(1000);
        
       
        
    };
    this.hide = function(){
        
        $(".simpleDialog").fadeOut(1000);
    };
    
    this.closeBtnRef.on("click",function(){
        
        $(".simpleDialog").fadeOut(1000);
    });
    
   
};


var imageGallery = function(){
    

     this.currentSrc;
     this.nextSrc;
     this.prevSrc;
     this.current_img = 0;
     this.current_hover_img  = 0;
     this.imgArray = $("#thumbnailGallery img");
     this.total_img = this.imgArray.length - 1;
     this.current_thumbnail_click = 0;
     this.nextBtnRef = $("#next");
     this.prevBtnRef = $("#prev");
     this.fullImageContainer = $("#fullImage");
     this.showEffect = "size";
     this.hideEffect = "size";
     this.thumbnailDiv = $("#thumbnailGallery");
     this.nextThumbnailBtn = $("#nextthumbnail");
     

this.startGallery = function startGallery(src){

	$("#lightboxWrapper").show(this.showEffect,1000);
	this.fullImageContainer.attr("src",src);
};

this.stopGallery = function stopGallery(){

	$("#lightboxWrapper").hide(this.hideEffect,1000);
};

this.nextImage = function nextImage(src){

	this.fullImageContainer.attr("src",src).hide().show(this.showEffect,{direction: 'right'},500);

};

this.prevImage = function prevImage(src){

this.fullImageContainer.attr("src",src).hide().show(this.hideEffect,{direction: 'left'},500);

};

this.removeAllCurrentClasses = function removeAllCurrentClasses(){

this.imgArray.each(function(){

		$(this).removeClass("current");
		
	});

};

this.refreshCurrentSrc = function refreshCurrentSrc(){

	var i = 0;
	this.imgArray.each(function(){

		
		if($(this).hasClass("current")){

			
			return false;

		}
		i++;
	});

	return i;
};

this.removeAllCurrentHoverClasses = function removeAllCurrentHoverClasses(){

this.imgArray.each(function(){

		$(this).removeClass("currentHover");
		
	});

};

this.refreshCurrentHoverImg = function refreshCurrentHoverImg(){

	var i = 0;
	this.imgArray.each(function(){

		
		if($(this).hasClass("currentHover")){

			
			return false;

		}
		i++;
	});

	return i;
};



this.reduceOpacity = function reduceOpacity(index){

	for(var i = 0; i <= total_img ;i++){

		if(i == index){

			this.imgArray.eq(i).animate({opacity:1.0},500);

		}
		else{

			this.imgArray.eq(i).animate({opacity:0.6},0);			
		}
	}


};

this.resetOpacity = function resetOpacity(){

	for(var i = 0; i <= total_img ;i++){

		

			this.imgArray.eq(i).animate({opacity:1.0},0);

		
	}


};

this.fillthumbnails = function fillthumbnails(){

	for(var i = 0; i <= this.total_img ;i++){

		

			var currentSrc = this.imgArray.eq(i).attr("src");
			$("#thumbnailGallery").append('<li><img src="'+currentSrc+'"/></li>');

		
	}

};


this.showNextThumbnails = function(){
    
    $("#thumbnailGalleryInner").animate({
        
      left:"-100%"
        
    },1000);

};

};

$(document).ready(function(){
    
    signup = new signUpForm("","","","","","","");
    gallery = new imageGallery();
    
     $('[data-toggle="tooltip"]').tooltip({});
        
    
        
 
    signup.emailRef.on("blur",function(){
        
            signup.email = signup.emailRef.val();
            signup.validateEmail();
            signup.emailRegisteredStatusCheck();
            console.log("Hii");
    });
    
    signup.conPasswordRef.on("blur",function(){
        
        signup.password = signup.passwordRef.val();
        signup.conpassword = signup.conPasswordRef.val();
       
        signup.validatePassword();
        
        
    });
    
    signup.submitBtnRef.on("click",function(e){
      
       e.preventDefault();
       
       
       signup.validateEmptyFields();
       signup.validatePassword();
       signup.validateEmail();
       
       if(signup.fieldStatus && signup.passwordStatus && signup.validEmailStatus && signup.emailRegisteredStatus){
           
            
            signup.firstName =  signup.firstNameRef.val();
            signup.lastName = signup.lastNameRef.val();
            signup.sex = signup.sexRef.val();
            signup.dob = signup.dobRef.val();
            
           signup.submitForm();
       }
       else{
           
           signup.displayError();
       }
        
    });
    
     $('.editProfileBtn').on("click",function(e){
         
         
            
            
            e.preventDefault();
            var loadingDialog = new bodyOnlyDialog("Loading Data Please Wait");
            loadingDialog.show();
            
            $.ajax({
                
                url:"user/EditUser",
                type:"post"
                
            }).success(function(html){
                
                loadingDialog.hide();
                $('.slidingDiv').html(html);
                $('.slidingDiv').fadeIn(500);
                //gallery = new imageGallery();
                
                
            });
        
           // $('.slideXL').slideDown(2000);
            
        
        });
        
     
            $(document).on("click","#next",function(e){


                           
                            gallery.current_img++;
                           
                            if(gallery.current_img > gallery.total_img){

                                    gallery.current_img = 0;
                            }
                            var src = gallery.imgArray.eq(gallery.current_img).attr("src");
                            gallery.nextImage(src);
                            e.stopPropagation();
                            e.preventDefault();
            });

            $(document).on("click","#prev",function(e){

                            gallery.current_img--;
                            if(gallery.current_img < 0){

                                    gallery.current_img = gallery.total_img;
                            }
                            var src = gallery.imgArray.eq(gallery.current_img).attr("src");
                            gallery.prevImage(src);
                            e.stopPropagation();
                            e.preventDefault();

            });
          
        $(document).on('click', '.closeSlidingDiv', function() {
                    
                    $('.slidingDiv').fadeOut(1000);
        }); 
    
        $(document).on('click','#nextthumbnail',function(){
            
            gallery.showNextThumbnails();
        });
    
});


