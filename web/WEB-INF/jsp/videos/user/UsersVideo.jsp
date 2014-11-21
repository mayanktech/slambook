<%-- 
    Document   : FriendsAlbums
    Created on : 4 Jan, 2014, 11:54:17 AM
    Author     : Mayank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row slideXL slidingDivInner" style="" >
                
                <div class="col-xs-12">
                    
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h4 class="panel-title text-center"><span class="glyphicon glyphicon-paperclip pull-left"></span> Friend's Name Videos <span class="glyphicon glyphicon-paperclip pull-right"></span></h4>
                        </div>
                   
                        <div class="panel-body" style="max-height:450px;overflow-y: auto;overflow-x:hidden">
 
                            
                         
                        <div class="row">
                            <c:forEach var="i" begin="1" end="8"> 
                            <div class="col-xs-4">
                                
                                        
                                        <div class="thumbnail">
                                            <div class="albumImagesNumberCaption">Video Caption</div>
                                            <img style="width:100%;" src="resources/images/14.jpg" alt="...">
                                            <div class="caption">
                                                    
                                                <small>Video label</small>
                                                
                                                                                                <div class="row">
                                                    
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                          <span class="glyphicon glyphicon-comment"></span> 100
                                                        </button>
                                                    </div>
                                                    <div class="col-xs-6 center"> 
                                                        <button type="button" class="btn btn-info btn-sm">
                                                          <span class="glyphicon glyphicon-heart-empty"></span> 100
                                                        </button>
                                                    </div>
                                                </div>
  
                                                 

                                            </div>
                                        </div>
                                        
                               
                                
                            </div>
                 
                            </c:forEach>
                        </div>
                            
                            
                        </div>
                        
                        <div class="panel-footer">
                            
                            
                             <p class="panel-title text-center"> <button class="btn btn-info btn-sm"><span class="glyphicon glyphicon-save"></span> Save Profile</button>&nbsp;&nbsp;<button class="btn btn-sm btn-danger closeSlidingDiv"> <span class="glyphicon glyphicon-remove"></span> Close</button> </p>
                            
                            
                        </div>
                        
                    </div>
                    
                </div>
    
</div>