<%-- 
    Document   : home
    Created on : 1 Jan, 2014, 7:53:37 PM
    Author     : Mayank
--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Slambook Home</title>
           <!-- <c:set var="url">${pageContext.request.requestURL}</c:set> -->
    <base href="${fn:substring(url, 0, fn:length(url) - fn:length(pageContext.request.requestURI))}${pageContext.request.contextPath}/" />
         
       
         <script type="text/javascript" src="resources/js/jquery-1.9.1.min.js"></script>
         <link href="resources/js/smoothness/jquery-ui-1.10.3.custom.min.css"  rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="resources/js/jquery-ui-1.10.3.custom.min.js"></script>
        <script type="text/javascript" src="resources/js/jquery.easing.1.3.js"></script>
        <script type="text/javascript" src="resources/js/jquery.booklet.latest.min.js"></script>
        <link href="resources/js/jquery.booklet.latest.css"  rel="stylesheet" type="text/css"/>
         <link href="resources/css/bootstrap.min.css"  rel="stylesheet" type="text/css"/>
          <link href="resources/css/style.css"  rel="stylesheet" type="text/css"/>
        <link href="resources/css/zocial.css"  rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="resources/js/bootstrap.js"></script>
        
       

        <script src="resources/js/script.js" type="text/javascript"></script>
        
        <script type="text/javascript">
	    $(function () {		
	        $("#mybook").booklet({
                    
                shadows:true,
                width:$('body > .container').width()-130,
                height:$(window).height()-70,
                arrows:true,
                closed:true,
                autoCenter:true,
                hash:true,
                covers:true,
                pagePadding:0,
                pageNumbers: false

                
        
        });
        
       
        
       
	    });
        </script>

        
        
        <style>
            
           
            
            
            
        </style>
    </head>
    <body style="min-width:1000px !important;width:100%;margin-top: 4%;">
       <!-- Main Container Wrapper -->
        <div class="container" style="min-width:100% !important">
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation" style="min-width:100% !important">
            <div class="container" style="min-width:100% !important; " >
                     <div class="row">
                    <div class="navbar-header">
                    <a class="navbar-brand" href="#" style="font-size:1.8em">&nbsp;&nbsp;<span class="glyphicon glyphicon-book"></span> &nbsp;Slambook</a>
                    </div>
                        <form class="navbar-form navbar-left" role="search">
                          <div class="form-group">
                            <input type="text" class="form-control" style="width:200%;" placeholder="Search For A Friend">
                          </div>
                          
                        </form>
                          
                         <ul class="nav navbar-nav navbar-right">
                             <li><a href="#"  data-toggle="tooltip" title="Messages" data-placement="bottom" class="largeText"><span class="glyphicon glyphicon-envelope"></span></a></li>
                             <li><a href="#"  data-toggle="tooltip" title="Notifications" data-placement="bottom" class="largeText"><span class="glyphicon glyphicon-globe"></span></a></li>
                             <li><a href="#"  data-toggle="tooltip" title="Photos & Videos" data-placement="bottom" class="largeText"><span class="glyphicon glyphicon-camera"></span></a></li>
                             <li><a href="#" data-toggle="tooltip" title="Friends List" data-placement="bottom" class="largeText"><span class="glyphicon glyphicon-list"></span>&nbsp;Friends</a></li>
                             <li><a href="#"  data-toggle="tooltip" title="Profile" data-placement="bottom" class="largeText"><span class="glyphicon glyphicon-user"></span>&nbsp;Profile</a></li>
                             
                             
                                  <li class="dropdown">
                                    <a href="#" class="dropdown-toggle largeText"   title="Account Settings" data-placement="bottom"data-toggle="dropdown"><span class="glyphicon glyphicon-wrench"></span>&nbsp;Account&nbsp;<b class="caret"></b>&nbsp;</a>
                                    <ul class="dropdown-menu" >
                                      <li><a href="#">Action</a></li>
                                      <li><a href="#">Another action</a></li>
                                      <li><a href="#">Something else here</a></li>
                                      <li class="divider"></li>
                                      <li><a href="#">Separated link</a></li>
                                    </ul>
                                  </li>
                         </ul>
                     </div>
                
                               
                    </div>
            
           
       </div>
        
            
            
          
            
            <div id="mybook" >
	        <div>
                    <div class="innerPage">
                        
                        <div class="row">
                            
                            <div class="col-xs-12 center-block center">
                                
                                <img src="resources/images/cover_page_bg.jpg" />
                                
                            </div>
                            
                        </div>
                    </div>
	        </div>
                <div>
	            <div class="innerPage">
                        
                        <div class="row">
                            
                            <div class="col-xs-12">
                                <span class="lead pull-left text-muted">Mayank Sharma</span>
                                <div class="dropdown pull-right">
                                    <span  class="dropdown-toggle largeText glyphicon glyphicon-cog pull-right"   title="Account Settings" data-placement="bottom"data-toggle="dropdown"></span></a>
                                    <ul class="dropdown-menu" >
                                      
                                      <li><a href="#" class="editProfileBtn">Edit Profile</a></li>
                                      <li class="divider"></li>
                                      <li><a href="#">Change Profile Picture</a></li>
                                      
                                    </ul>
                                  </div>
                                
                            </div>
                        
                        </div>
                        <div class="row">
                            <div class="col-xs-8">
                                
                                <h4 class="questions">Tagline <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Introduction <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                               
                            </div>
                            
                            <div class="col-xs-4" style="height:150px;">
                                
                                <img style="width:100%;height:100%;" src="resources/images/14.jpg" alt="..." class="img-thumbnail thumbnail">
                                
                            </div>
                            
                        </div>
                        
                        
                        <div class="row">
                            
                            <div class="col-xs-12">
                                
                                 <h4 class="questions">Bragging Rights <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Places Lived <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Looking For <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Birthday <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                            </div>
                            
                            
                        </div>
                            
                   </div>
                        
                   
	        </div>
	        <div>
	           <div class="innerPage">
                        
                       
                        <div class="row">
                            
                            <div class="col-xs-12">
                                
                                 <h4 class="questions">Email <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Gender <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Relationship Status <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">School <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">College <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Employment <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Website <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                               </div>
                            
                            
                        </div>
                        
                    </div>
	        </div>
	        <div>
	            <div class="innerPage">
                        
                        <div class="row" style="margin-bottom:2%;">
                            
                            <div class="col-xs-11">
                                
                                <div>
                                    
                                    <span class="lead text-muted" style="text-align: center;margin-left:40%;"><span class="glyphicon glyphicon-picture"></span> Your Albums</span>
                                    
                                    
                                  <div class="dropdown pull-right">
                                    <span  class="dropdown-toggle largeText glyphicon glyphicon-cog pull-right"   title="Account Settings" data-placement="bottom"data-toggle="dropdown"></span></a>
                                    <ul class="dropdown-menu" >
                                      
                                      <li><a href="#">Create New Album</a></li>
                                      <li class="divider"></li>
                                      <li><a href="#">Add Images To An Album</a></li>
                                      
                                    </ul>
                                  </div>
                                
                                </div>
                                
                            </div>
                          
                        </div>
                        
                        
                        
                        
                        <c:forEach var="i" begin="1" end="6">
                        <div class="row">
                            
                            <div class="col-xs-6">
                                
                                        
                                        <div class="thumbnail">
                                            <div class="albumImagesNumberCaption">9 photos</div>
                                            <img style="width:100%;" src="resources/images/14.jpg" alt="...">
                                            
                                            <div class="caption">
                                                    
                                                <small>Thumbnail label</small>
                                                
                                                  <div class="row">
                                                    
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                            <span class="glyphicon glyphicon-comment"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                          <span class="glyphicon glyphicon-heart-empty"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                </div>
  
                                                 

                                            </div>
                                        </div>
                                        
                               
                                
                            </div>
                            
                            <div class="col-xs-6">
                                
                                 <div class="thumbnail">
                                     <div class="albumImagesNumberCaption">9 photos</div>       
                                     <img style="width:100%;" src="resources/images/14.jpg" alt="...">
                                            <div class="caption">
                                                    
                                                <small>Thumbnail label</small>
                                                
                                                 <div class="row">
                                                    
                                                      <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                            <span class="glyphicon glyphicon-comment"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                          <span class="glyphicon glyphicon-heart-empty"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                </div>
                                                   
                                            </div>
                                 </div>
                            
                            </div>
                            
                        </div>
                        </c:forEach>
                        <div class="row">
                            
                            <div class="col-xs-12">
                                
                                <button class="btn btn-info center-block">
                                    
                                    Load More
                                    
                                </button>
                                
                            </div>
                            
                            
                        </div>  
                        
                        
                        
                        
                    </div>
	        </div>
	        
                
                
                <div>
	            <div class="innerPage">
                       
                        <div class="row">

                           <div class="col-xs-10 col-xs-offset-1">
                                
                               <p style="text-align:center"><span class="lead text-muted" style="text-align: center"><span class="glyphicon glyphicon-film"></span> Your Videos</span><span class="pull-right largeText glyphicon glyphicon-cog"></span></p>
                                
                            </div>
 
                                                        
                        </div>
                        
                        <c:forEach var="i" begin="1" end="6">
                        <div class="row">
                            
                            
                            <div class="col-xs-6">
                                
                               
                                <div class="thumbnail">
                                             <img style="width:100%;"  src="http://img.youtube.com/vi/my6w4EhuVmw/sddefault.jpg"/>
                                            <div class="caption">
                                                    
                                                <small class="videoLabel">Video label</small>
                                                 
                                                <div class="row">
                                                    
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                            <span class="glyphicon glyphicon-comment"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                          <span class="glyphicon glyphicon-heart-empty"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                </div>   
                                            </div>
                                 </div>
                                
                            </div>
                            
                            <div class="col-xs-6">
                                
                                 <div class="thumbnail">
                                             <img style="width:100%;"  src="http://img.youtube.com/vi/my6w4EhuVmw/sddefault.jpg"/>
                                            <div class="caption">
                                                    
                                                <small>Video label</small>
                                                
                                                <div class="row">
                                                    
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                            <span class="glyphicon glyphicon-comment"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                          <span class="glyphicon glyphicon-heart-empty"></span> <span class="badge">100</span>
                                                        </button>
                                                    </div>
                                                </div>   
                                                   
                                            </div>
                                 </div>
                                
                            </div>
                        </div>
                        </c:forEach>
                         
                        
                       <div class="row">
                            
                            <div class="col-xs-12">
                                
                                <button class="btn btn-info center-block">
                                    
                                    Load More
                                    
                                </button>
                                
                            </div>
                            
                            
                        </div>  
                        
                    </div>
	        </div>
	        
                
                
                
                 <c:forEach var="i" begin="1" end="6">
                 <div>
	            <div class="innerPage">
                        <div class="row">
                            
                            <div class="col-xs-12">
                                <span class="lead pull-left text-muted">Mayank Sharma</span>
                                <span class="largeText pull-right glyphicon glyphicon-cog" > 
                                    
                                </span>
                                                                

                                <span style="margin-right: 20px;" class=" largeText pull-right glyphicon glyphicon-envelope"></span>
                            </div>
                        
                        </div>
                        
                        <div class="row">
                            <div class="col-xs-8">
                                
                                <h4 class="questions">Loved Ones Call Me <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">My Zodiac <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                               
                            </div>
                            
                            <div class="col-xs-4" style="height:150px;">
                                
                                <img style="width:100%;height:100%;" src="resources/images/14.jpg" alt="..." class="img-thumbnail thumbnail">
                               
                            </div>
                            
                        </div>
                        
                        <div class="row">
                            
                            <div class="col-xs-12">
                                
                                <h4 class="questions">I Was On Cloud9 When <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">My Secret Desire Is <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Person I Admire The Most <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">My Ideal Vacation Spot <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                               
                            
                            </div>
                            
                            
                        </div>
                        
                    </div>
	        </div>
                
                <div>
	            <div class="innerPage">
                        
                        <div class="row">
                            
                            <div class="col-xs-2 col-md-offset-2">
                                
                                <button class="btn btn-info pull-left  friendAlbumBtn"><span class="glyphicon glyphicon-camera"></span> My Images</button>
                                
                                
                            </div>
                            <div class="col-xs-2 col-md-offset-4">
                                
                                
                                <button class="btn btn-info pull-left"><span class="glyphicon glyphicon-film"></span> My Videos</button>
                                
                            </div>
                            
                        </div>
                        
                        <div class="row">
                            
                            <div class="col-xs-12">
                                
                                <h4 class="questions">I Define Love As  <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">I Would Like To Go On A Date With <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">One Thing Missing In My Life Is <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">Oops I Made A Mistake When <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">I Am Proud Of <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">I Like You Because You Are <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                <h4 class="questions">My Latest Crush <small>sdsnd asdsad sadsad sdsadsddsads dagdsaud sadsasadsb </small></h4>
                                
                            
                            </div>
                            
                            
                        </div>
                    </div>
	        </div>
                 </c:forEach>
                
                <div>
	            <div class="innerPage">
                        
                        
                    </div>
	        </div>
	    </div>
            
            <!-- Footer -->
<!--            <div class="navbar navbar-inverse navbar-fixed-bottom">
                        
                       <span class="navbar-text navbar-right">Developed By <a href="#" class="navbar-link">Mayank Sharma &nbsp;&nbsp;</a></span>
                       <span class="navbar-text navbar-left"><span class="glyphicon glyphicon-copyright-mark"></span>&nbsp;2013 Mayank Sharma</span>
                        
           </div>    -->
            <!-- Footer -->
     </div>
     <!-- Main Container Wrapper -->

     
     
      <!-- Sliding-XL Container Wrapper -->
      
       
       
       <div class="slidingDiv">
          
          
          
      </div>
      
      <!-- Sliding-XL Container Wrapper -->
      
      <!-- Profile Menu Container Wrapper -->
      
      <div class="profileMenuHtml">
          
          
      </div>
      
      <!-- Profile MEnu Container Wrapper -->
            <!-- Body Only Modal -->
                    <div class="modal fade" id="bodyOnlyModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                      <div class="modal-dialog">
                        <div class="modal-content">
                         
                          <div class="modal-body">
                            
                          </div>
                         
                        </div><!-- /.modal-content -->
                      </div><!-- /.modal-dialog -->
                    </div><!-- /.modal --> 
             
    </body>
</html>
