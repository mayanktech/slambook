/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
var gallery;
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
    
    
    gallery = new imageGallery();
    
     $('[data-toggle="tooltip"]').tooltip({});
        
    
        
 
        
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


